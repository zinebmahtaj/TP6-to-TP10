package ma.cigma.controllers;

import ma.cigma.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@Controller
public class ClientController {
    @Value("${api.url}")
    private String apiUrl;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = {"/", "/clients"})
    public String home(Model model) {
        model.addAttribute("client", new Client());
        List<Client> clients = restTemplate.getForObject(apiUrl + "/clients/all", List.class);
        model.addAttribute("client", clients);
        return "index-client";
    }
    @PostMapping(value="/add-client")
    public String addClient(Model model, @ModelAttribute("client") Client client){
        restTemplate.postForObject(apiUrl+"/clients/add", client,Client.class);
        return "redirect:/clients";
    }
    @DeleteMapping(value="/delete-client/{id}")
    public String deleteClientById(Model model, @PathVariable long id){
        restTemplate.delete(apiUrl+"/clients/"+id);
        return "redirect:/clients";
    }
}

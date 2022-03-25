package ma.cigma.controllers;

import ma.cigma.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ClientController {

    public static void main(String[] args) {
        RestTemplate r=new RestTemplate();
        List<Client> clients = r.getForObject("http://localhost:8083/api/client/all", List.class);
        System.out.println(clients);
    }
    @Value("${api.url}")
    private String apiUrl;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = {"/", "/client"})
    public String home(Model model , Client c) {
        model.addAttribute("client",c==null? new Client() : c );
        List<Client> clients = restTemplate.getForObject(apiUrl+"/client/all", List.class);
        model.addAttribute("clients",clients);
        return "index-client";
    }
    @GetMapping(value = {"/show-client/{id}"})
    public String show(RedirectAttributes ra, @PathVariable long id){
        Client client = restTemplate.getForObject(apiUrl+"/client/"+id, Client.class);
        ra.addFlashAttribute("client",client);
        return "redirect:/client";
    }
    @PostMapping(value = "/add-client" , params = "add")
    public String addClient(Model model, @ModelAttribute("client") Client client) {
        restTemplate.postForObject(apiUrl+"/client/create", client, Client.class);
        return "redirect:/client";
    }
    @PostMapping(value = "/add-client",params ="update")
    public String updateClient(Model model, @ModelAttribute("client") Client client) {
        restTemplate.put(apiUrl+"/client/update", client, Client.class);
        return "redirect:/client";
    }
    @GetMapping(value = {"/delete-client/{id}"})
    public String deleteClientById(Model model, @PathVariable long id) { restTemplate.delete(apiUrl+"/client/delete/"+id);
        return "redirect:/client";
    }
}
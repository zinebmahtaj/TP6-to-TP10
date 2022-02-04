package cigma.pfe.services;

import cigma.pfe.repositories.ClientRepository;
import cigma.pfe.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


    @Service
    @Transactional
    public class ClientServiceImpl implements ClientService {
        @Autowired
        private Client dao;

        public ClientServiceImpl() {
            System.out.println("creation bean service");
        }

        @Override
        public Client save(Client c) {
            return null;
        }

        @Override
        public Client modify(Client c) {
            return null;
        }
    }

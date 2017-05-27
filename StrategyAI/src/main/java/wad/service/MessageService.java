package wad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import wad.domain.Message;

@Service
public class MessageService {

    @Autowired
    private Poliitikko poliitikko;

    @Autowired
    private Urheilija urheilija;

    @Autowired
    private SimpMessagingTemplate template;

    public void addMessage(Message message) {
        this.template.convertAndSend("/channel/" + message.getChannel(), message);
    }

    // lähettää viestejä 10 sekunnin välein default-kanavalle
    @Scheduled(fixedDelay = 12000)
    public void send() {
        this.template.convertAndSend("/channel/default", poliitikko.getMessage());
    }
    // Tuo default-kanavalle lisäksi urheilijan näkemyksen ajankohtaisiin asioihin
    @Scheduled(fixedDelay = 9000)
    public void sendAnother() {
        this.template.convertAndSend("/channel/default", urheilija.getMessage());
    }
}

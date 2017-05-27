package wad.service;

import org.springframework.stereotype.Service;
import wad.domain.Message;

import java.util.Random;
@Service
public class Urheilija {

    private final String[] lentavatLauseet = {"Meikäläisen aikataulu on sellainen, että ikinä ei olla myöhässä mistään",
            "Nyt on korkki auki. Hämmästyttää ja ihmetyttää.",
            "Kihlat meni, mutta suhdetoiminta jatkuu",
            "Ruokarauha se on merirosvollakin.",
            "Ennen oli poliisit sentään poliiseja ja laivat rautaa. Nyt on poliisit peltiä ja laivat mitä lie lasikuitua.",
            "Minäkin olen jonkinnäköinen mestari, otetaan erä.",
            "Elämä on laiffii.",
            "Ehkä otin, ehkä en, so not, kunhan hyppy kulkee.",
            "Elämä on ihmisen parasta aikaa.",
            "Jokainen tsäänssi on mahdollisuus!",
            "Se on ihan fifty-sixty miten käy.",
            "Rakkaus on kuin lankakerä - se alkaa ja loppuu.",
            "Kaikki on all right ainakin minulla. En tiedä, onko muilla.",
            "Huominen on aina tulevaisuutta.",
            "Asiat ovat sekaisin kuin Haminan kaupunki.",
            "Saksa-Itävalta on mun toinen kotimaa.",
            "Lahti on kyllä ihan mesta paikka.",
            "Kun sä lähdet hyppyyn, sä olet ihan yksin. Sä joudut siinä hyppyrinnokalla tekemään yksinäsi ihan omat ratkaisut. Sä oot siellä ylhäällä ihan up yours.",
            "Aina ku mä hyppään ja pääsen siihen hyppyrin nokalle, niin mulle tulee sellanen bon voyage -tunne, siis että mä oon kokenu tän joskus aikasemminkin.",
            "En suosittele antabusta kenellekään. Sen kanssa ryypätessä tulee ihan kammottava olo.",
            "Mulla on karismaa!",
            "Mä en mene siihen lankaan että alkaisin haalimaan jotain omaisuutta.",
            "No pilluhan se on aina mielessä mutta hypätään nyt ensin!",
            "Niinhän se on, meillä nostetaan perunoita keväällä ja muualla syksyllä!",
            "Joka toista tökkii, niin kyllä se jossain vaiheessa siellä alapäässä alkaa tuntua, ettei olisi kannattanut tökkiä väärään paikkaan.",
            "Sauvakävelin siellä järvellä ja opin avantouinnin.",
            "Kysymys kuulostaa kysymykseltä.",
            "On se aika epäkornia käytöstä.",
            "Kaikkihan meistä on syöny makkaraa. Mutta kuka meistä on syöny ylikypsää Tapolaa?",
            "Meikäläinen on nykyään avioliittoneuvoja. Jos menee hyvin niin meikäläinen paikalle. Se on seittemän sekuntia ja kaikki on päin persettä.",
            "Eiköhän se niin päin oo että tuo toinen osapuoli pikkusen reippaammin ottaa tuota alkoholia.",
            "Mä olen edelleen maailman paras mäkihyppääjä, nykytyylillä voisin hypätä 300 m halkomotti selässä",
            "Elokuva elokuvana. Elokuva kun tehdään, niin se on elokuvaa.",
            "Tekemätöntä ei saa tekemättömäksi",
            "Kyllähän se Rosberg puhui sijoitusasioista, mutta ei mulle ole mitään iloa siitä että laitan rahoja jonnekin Monacoon. Jos saan ite valita, niin puhtaana käteen, kiitos.",
            "Ajattelin, että kaikki lähtee taas samaa oravanpyörää. Keikka, siideri, kaksi siideriä, sitten kori ja poliisit. Nyt kun olen ollut päihteettömien osastolla ja käsitellyt asiaa, niin kyllä minun pitää pystyä hoitamaan työni ilman siideriä.",
            "Mä tunnen kovan jätkän, se pelaa shakkia, mutta koskaan ei oo voittanut mattia!",
            "Jos se romaanimuotoon kirjoitetaan, niin siinä kirjassa ei ole yhtään totta.",
            "Sovitaanko että sinä oot vahtimestari ja minä oon maailmanmestari?",
            "Totuus on todellakin todellisuutta.",
            "Sävytän hiukseni kerran kahdessa kuukaudessa ja maailma muuttuu, ja minä sen mukana.",
            "Erityisesti pidän kananmunan valkuaisista, joita kuluu noin 15 yhdessä päivässä.",
            "Elokuva oli täyttä fiktiota, mutta oli siinä vähän faktaakin.",
            "Ja se mitä tota tänään iltapäivälehdessä on lukenu että me heitetään leipäkkinä ni se ei pidä paikkaansa. Tää koko toimittaja on leipäkki koko jätkä.",
            "Ja jos jokin asia on varma, se on aivan varma.",
            "Olen varautunut jokaiseen päivään. Huomiseenkin.",
            "Meillä menee keikoilla tosi lujaa. Siellä on keskimäärin seitsemästäsadasta kuuteensataan ihmistä.",
            "Jos päästä jotain puuttuis, niin kai sitä sinne olis ruiskutettu.",
            "Kivitettiinhän Jeesustakin aikanaan, mutta nyt mies on maailman maineessa.",
            "Olin kuolla pakkaseen, mutta vielä riitti voimia tilata taksi.",
            "En ole ulkona kuvioista, olen pihalla.",
            "Huvinsa kullakin, sanoi pässi kun päätä leikattiin.",
            "Onpa mentaalinen olo.",
            "Kun ihminen nukkuu, sille ei tapahdu mitään. Mutta kun se ei nuku, se voi saada vaikka kalan.",
            "Jos minulta on ennen lähtenyt mopo käsistä niin nyt lähti kyllä sanoisinko että formula.",
            "Minusta alkaa tuntua siltä, että kuulun jokaisen suomalaisen kodin perheeseen.",
            "Kaikki lähtee siitä kun sä opit syömään lihapullat haarukalla. Silloin sä osaat tehdä mitä tahansa. Kiinnostus ruokaan ja kiinnostus urheiluun menevät rinta rinnan",
            "Kaiken kokeneena voin sanoa, että vielä on jotain kokematta.",
            "Kun otan, niin juon",
            "Alkoholiongelma on se, että ei ole alkoholia.",
            "Alkoholiongelmaa ei ole, kun on alkoholia."};

    public Message getMessage() {
        Message msg = new Message();
        msg.setContent(lentavatLauseet[new Random().nextInt(lentavatLauseet.length)]);
        msg.setUsername("MN");
        return msg;
    }
}

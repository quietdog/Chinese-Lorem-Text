package com.wicky.lorem;

import java.io.IOException;

import org.apache.commons.httpclient.HttpException;

import com.jfinal.core.Controller;

public class IndexController extends Controller {
    
    public void index() throws HttpException, IOException {
        render("/index.html");
    }
    
    public void xss() throws HttpException, IOException {
        render("/xss.html");
    }
    
    public void interceptor() throws HttpException, IOException {
        render("/interceptor.html");
    }
    
    public void scroll() throws HttpException, IOException {
        render("/scroll.html");
    }

    public void scrollData() throws HttpException, IOException {
        renderHtml(""
                + "  <a href='' scroll-to='top' class='back'>Back to top</a>                   "
                + "  <h1 id='section1'>Hi, I'm a help screen.</h1>                             "
                + "  <p>Zombie ipsum reversus ab viral inferno, nam rick grimes malum          "
                + "    cerebro. De carne lumbering animata corpora quaeritis. Summus brains    "
                + "    sit??, morbo vel maleficia? De apocalypsi gorger omero undead survivor  "
                + "    dictum mauris. Hi mindless mortuis soulless creaturas, imo evil         "
                + "    stalking monstra adventus resi dentevil vultus comedat cerebella        "
                + "    viventium. Qui animated corpse, cricket bat max brucks terribilem       "
                + "    incessu zomby. The voodoo sacerdos flesh eater, suscitat mortuos        "
                + "    comedere carnem virus. Zonbi tattered for solum oculi eorum defunctis   "
                + "    go lum cerebro. Nescio brains an Undead zombies. Sicut malus putrid     "
                + "    voodoo horror. Nigh tofth eliv ingdead.</p>                             "
                + "                                                                            "
                + "<a href='' scroll-to='top' class='back'>Back to top</a>                     "
                + "<h1>I'm more help</h1>                                                      "
                + "<p>Cum horribilem walking dead resurgere de crazed sepulcris                "
                + "    creaturis, zombie sicut de grave feeding iride et serpens.              "
                + "    Pestilentia, shaun ofthe dead scythe animated corpses ipsa screams.     "
                + "    Pestilentia est plague haec decaying ambulabat mortuos. Sicut zeder     "
                + "    apathetic malus voodoo. Aenean a dolor plan et terror soulless          "
                + "    vulnerum contagium accedunt, mortui iam vivam unlife. Qui tardius       "
                + "    moveri, brid eof reanimator sed in magna copia sint terribiles undeath  "
                + "    legionis. Alii missing oculis aliorum sicut serpere crabs nostram.      "
                + "    Putridi braindead odores kill and infect, aere implent left four dead.  "
                + "</p>                                                                        "
                + "                                                                            "
                + "<a href='' scroll-to='top' class='back'>Back to top</a>                     "
                + "<h1 id='section2'>You look like you need help</h1>                          "
                + "<p>Lucio fulci tremor est dark vivos magna. Expansis creepy arm yof         "
                + "    darkness ulnis witchcraft missing carnem armis Kirkman Moore and        "
                + "    Adlard caeruleum in locis. Romero morbo Congress amarus in auras.       "
                + "    Nihil horum sagittis tincidunt, zombie slack-jawed gelida survival      "
                + "    portenta. The unleashed virus est, et iam zombie mortui ambulabunt      "
                + "    super terram. Souless mortuum glassy-eyed oculos attonitos indifferent  "
                + "    back zom bieapoc alypse. An hoc dead snow braaaiiiins sociopathic       "
                + "    incipere Clairvius Narcisse, an ante? Is bello mundi z?</p>             "
                + "                                                                            "
                + "<a href='' scroll-to='top' class='back'>Back to top</a>                     "
                + "<h1 id='section3'>Please someone help this person</h1>                      "
                + "<p>In Craven omni memoria patriae zombieland clairvius narcisse             "
                + "    religionis sunt diri undead historiarum. Golums, zombies unrelenting    "
                + "    et Raimi fascinati beheading. Maleficia! Vel cemetery man a modern      "
                + "    bursting eyeballs perhsaps morbi. A terrenti flesh contagium. Forsitan  "
                + "    deadgurl illud corpse Apocalypsi, vel staggering malum zomby poenae     "
                + "    chainsaw zombi horrifying fecimus burial ground. Indeflexus shotgun     "
                + "    coup de poudre monstra per plateas currere. Fit de decay nostra carne   "
                + "    undead. Poenitentiam violent zom biehig hway agite RE:dead              "
                + "    p?nitentiam! Vivens mortua sunt apud nos night of the living dead.</p>  "
                + "                                                                            "
                + "<a href='' scroll-to='top' class='back'>Back to top</a>                     "
                + "<h1 id='section4'>I'm scared</h1>                                           "
                + "<p>In Craven omni memoria patriae zombieland clairvius narcisse             "
                + "    religionis sunt diri undead historiarum. Golums, zombies unrelenting    "
                + "    et Raimi fascinati beheading. Maleficia! Vel cemetery man a modern      "
                + "    bursting eyeballs perhsaps morbi. A terrenti flesh contagium. Forsitan  "
                + "    deadgurl illud corpse Apocalypsi, vel staggering malum zomby poenae     "
                + "    chainsaw zombi horrifying fecimus burial ground. Indeflexus shotgun     "
                + "    coup de poudre monstra per plateas currere. Fit de decay nostra carne   "
                + "    undead. Poenitentiam violent zom biehig hway agite RE:dead              "
                + "    p?nitentiam! Vivens mortua sunt apud nos night of the living dead.</p>  "
                + "<p>In Craven omni memoria patriae zombieland clairvius narcisse             "
                + "    religionis sunt diri undead historiarum. Golums, zombies unrelenting    "
                + "    et Raimi fascinati beheading. Maleficia! Vel cemetery man a modern      "
                + "    bursting eyeballs perhsaps morbi. A terrenti flesh contagium. Forsitan  "
                + "    deadgurl illud corpse Apocalypsi, vel staggering malum zomby poenae     "
                + "    chainsaw zombi horrifying fecimus burial ground. Indeflexus shotgun     "
                + "    coup de poudre monstra per plateas currere. Fit de decay nostra carne   "
                + "    undead. Poenitentiam violent zom biehig hway agite RE:dead              "
                + "    p?nitentiam! Vivens mortua sunt apud nos night of the living dead.</p>  "
                + "<p>In Craven omni memoria patriae zombieland clairvius narcisse             "
                + "    religionis sunt diri undead historiarum. Golums, zombies unrelenting    "
                + "    et Raimi fascinati beheading. Maleficia! Vel cemetery man a modern      "
                + "    bursting eyeballs perhsaps morbi. A terrenti flesh contagium. Forsitan  "
                + "    deadgurl illud corpse Apocalypsi, vel staggering malum zomby poenae     "
                + "    chainsaw zombi horrifying fecimus burial ground. Indeflexus shotgun     "
                + "    coup de poudre monstra per plateas currere. Fit de decay nostra carne   "
                + "    undead. Poenitentiam violent zom biehig hway agite RE:dead              "
                + "    p?nitentiam! Vivens mortua sunt apud nos night of the living dead.</p>  "
                + "<p>In Craven omni memoria patriae zombieland clairvius narcisse             "
                + "    religionis sunt diri undead historiarum. Golums, zombies unrelenting    "
                + "    et Raimi fascinati beheading. Maleficia! Vel cemetery man a modern      "
                + "    bursting eyeballs perhsaps morbi. A terrenti flesh contagium. Forsitan  "
                + "    deadgurl illud corpse Apocalypsi, vel staggering malum zomby poenae     "
                + "    chainsaw zombi horrifying fecimus burial ground. Indeflexus shotgun     "
                + "    coup de poudre monstra per plateas currere. Fit de decay nostra carne   "
                + "    undead. Poenitentiam violent zom biehig hway agite RE:dead              "
                + "    p?nitentiam! Vivens mortua sunt apud nos night of the living dead.</p>  "
                + "");
    }
}

# BroFo-MediaDist
A media distribution system written in Java EE






**This is an assignment from school the original assignment document looks like this (written in Swedish):**

## Mediadistributören AB.

Mediadistributören AB, är ett företag med säte i Grönköping. De handhar distribution av morgontidningar i Västra Götalands län. De har ett stort antal tidningsutgivare som kunder, GP, SVD, DN, SLA och Hjo Tidning för att nämna några.
Från tidningarnas prenumerationsavdelningar erhåller Mediadistributören uppgifter om ingångna och avslutade prenumerationsavtal.
Distributionen sker i två steg. Tidningarna transporteras på olika sätt till MediaDistributören. Det vanligaste medlet är dock järnväg. Sedan körs tidningarna ut till de olika tidningsdistrikten, där tidningsbuden tar emot och distribuerar till prenumeranten.
Verksamheten är uppdelad i olika länsdistrikt. Gränserna för dessa går i ganska grova drag utmed kommungränserna. Länsdistrikten är i sin tur uppdelade i olika ”tidningsdistrikt”. En del av dessa distrikt ligger inom stadsbebyggd område medan andra ligger på landsbygd. För varje distrikt finns ett ansvarigt tidningsbud, som har till uppgift att distribuera tidningarna till prenumeranterna på morgonen. Det finns också i varje länsdistrikt ett ansvarigt ombud, som har det övergripande ansvaret för att ordna vikarier för sjuka tidningsbud, samt att dela ut tidningar, som buden har glömt (reklamationer). 
Mediadistributören AB har insett behovet av ett datoriserat informationssystem för att få flyt i verksamheten. Man vänder sig till dig med uppdraget att skapa en databas för ändamålet.
###Syfte och mål
* Man ska på ett smidigt och korrekt sätt kunna hålla ordning på uppgifter om anställda, prenumeranter och tidningsutgivare. 
* För att kunna beräkna lönerna till buden, samt distriktens lönsamhet, så vill man kunna hålla reda på hur många tidningar vart och ett av buden distribuerar, och av vilken tidningsutgivare. 
* Man behöver ibland kunna skicka ut aktuella listor till tidningsbuden, för att dessa ska kunna hålla koll på vilka prenumeranter, som ska ha vilken eller vilka tidningar. 
* Man måste också ha koll på hur många prenumeranter var och en av tidningsutgivarna har, för att kunna kontrollera fakturorna mot tidningsutgivarna. 
* Man vill också kunna dra ut olika statitiska uppgifter ur systemet. 
* Dessa uppgifter ska ligga till grund för olika ekonomiska och strategiska beslut i företaget.
 
###Arbetsgång
* Börja med att noga gå igenom syfte och mål med databasen. Utifrån syfte och mål konstruerar du en datamodell.
* Skapa databasen i MySQL
* Lägg in lite data i databasen.
* Kör lite frågor mot databasen, som till exempel utdraget nedan.

```
+-------------------+-----------------+------+----------+
| utdelningsadress  | abbonent        | tidn | distrikt |
+-------------------+-----------------+------+----------+
| Sturegatan 8b     | Petersson Kent  | SLA  | 1:1:Hjo  |
| Sturegatan 8c 2tr | Karlsson Magnus | GP   | 1:1:Hjo  |
| Sturegatan 8c 2tr | Karlsson Magnus | SVD  | 1:1:Hjo  |
| Sveavägen 11      | Enoksson Alf    | GP   | 1:1:Hjo  |
| Sveavägen 11      | Enoksson Alf    | SVD  | 1:1:Hjo  |
| Sveavägen 7       | Larsson Anna    | GP   | 1:1:Hjo  |
+-------------------+-----------------+------+----------+
```

När detta är klart så skapar du en webbplats för Mediadistributören AB. Via denna ska tidningsbuden kunna hämta aktuella listor och se sina lönespecifikationer. Man ska kunna teckna och avbryta prenumerationer via webbsidan. Vidare så ska man kunna anmäla utebliven tidning.

Du skapar det hela med Java Enterprise.

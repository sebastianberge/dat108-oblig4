# Oppgave 2

## 2a)

*Forklar hvilke type problemer som problemklassene P, NP og NPC inneholder.*

P inneholder alle problemer som er lett både å løse og verifisere løsningen.
Et problem P har en løsning som har en deterministisk polynomiell tid. Dette gjør at å finne løsningen og å verifisere at den er riktig kan være effektiv.

NP er et supersett av P som inneholder problemer som er vanskelig å regne ut. F.eks. sudoku, og også mange krypteringsfunksjoner som brukes i hverdagen.
NP problem kan ikke løses løses på samme måte som P, men kan løses ved å bruke en ikke-determinisktisk polynomiell tids algoritme. Algoritmen som sjekker om svaret er rett kan ha detereministisk polynomiell tid.


NPC er hvor problemet x er NP og ethvert problem i NP kan bli redusert eller omformet til problemet x. Det gjør at x vil være NP - komplett. Alle problemer i NP kan bli omformet til et problem i NPC, og hvis du løser ett problem i NPC løser du alle problemene.



## 2b)

*Forklar hva som menes med en n-tilnærmingsalgoritme?*

En n-tilnærmingsalgoritme prøver å løse np problemer i polynomiell tid med med løsninger som er tilnærmet det optimale svaret. Vanligvis så bruker løsningen å være uttrykt i en tilnærmingsfaktor eller tilnærmingsledd som det optimale svaret skal være innenfor.


## 2c)

*«Reisende handelsmann»-problemet er et NP-komplett problem som er beslektet med «nodedekning»-problemet som består i å finne den korteste stien i en vektet graf og som besøker nodene i grafen nøyaktig en gang og som starter og slutter i samme node. En enkel tilnærmingsalgoritme for dette problemet er «nærmeste-nabo»-algoritmen. Pseudokode for algoritmen finner du under.*

### i)

*Hva er den korteste sykelen i grafen under?*

Den korteste sykelen til grafen under er:
<a,c>:1, <c,b>:2, <b,e>:2, <e,f>:1, <f,d>:4, <d,a>:3
med total lengde 13.

### ii)

*Hvilken sykel gir algoritmen som resultat dersom du starter i f?*

Sykelen som algoritmen får som resultat er:
<f,e>:1, <e,b>:2, <b,a>:1, <a,c>:1, <c,d>:8, <d,f>:
med total lengde 17. 




### iii)

*Hva sier dette om ordenen n til tilnærmingsalgoritmen?*

Disse resultatene gir oss tilnærmingsrate: max(17/13,13/17) = 1.3
Dette betyr at algoritmen vil ha et max avik faktor n med minimum 1.3.





![Graf.png](https://github.com/sebastianberge/dat108-oblig4/raw/master/Graf.png "Graf")

### Nærmeste nabo:

1. Velg en tilfeldig node som aktuell node.
2. Finn den korteste kanten som forbinder aktuell node med en ubesøkt node N.
3. Sett aktuell node til N.
4. Merk N som besøkt.
5. Dersom alle noder er besøkt, avslutt og returner en sekvens av noder.
6. Gå til steg 2.

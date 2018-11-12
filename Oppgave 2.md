# Oppgave 2

## 2a)

Forklar hvilke type problemer som problemklassene P, NP og NPC inneholder.

## 2b)

Forklar hva som menes med en n-tilnærmingsalgoritme?

## 2c)

«Reisende handelsmann»-problemet er et NP-komplett problem som er beslektet med «nodedekning»-problemet som består i å finne den korteste stien i en vektet graf og som besøker nodene i grafen nøyaktig en gang og som starter og slutter i samme node. En enkel tilnærmingsalgoritme for dette problemet er «nærmeste-nabo»-algoritmen. Pseudokode for algoritmen finner du under.

### i)

Hva er den korteste sykelen i grafen under

### ii)

Hvilken sykel gir algoritmen som resultat dersom du starter i f?

### iii)

Hva sier dette om ordenen n til tilnærmingsalgoritmen.

![Graf.png](https://github.com/sebastianberge/dat108-oblig4/raw/master/Graf.png "Graf")

### Nærmeste nabo:

1. Velg en tilfeldig node som aktuell node.
2. Finn den korteste kanten som forbinder aktuell node med en ubesøkt node N.
3. Sett aktuell node til N.
4. Merk N som besøkt.
5. Dersom alle noder er besøkt, avslutt og returner en sekvens av noder.
6. Gå til steg 2.

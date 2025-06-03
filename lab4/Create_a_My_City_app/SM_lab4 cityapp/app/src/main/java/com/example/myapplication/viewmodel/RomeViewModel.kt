package com.example.myapplication.viewmodel

import androidx.lifecycle.ViewModel
import com.example.myapplication.R
import com.example.myapplication.data.Recommendation
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class RomeViewModel : ViewModel() {
    private val _monuments = MutableStateFlow(
        listOf(
            Recommendation("Colosseum", "Iconic amphitheater for gladiator games.", R.drawable.colosseum),
            Recommendation("Pantheon","Well-preserved Roman temple.",R.drawable.pantheon),
            Recommendation("Roman Forum","Center of public life in Ancient Rome.",R.drawable.forum),
            Recommendation("Arch of Constantine","Triumphal arch celebrating victory.",R.drawable.constantine),
            Recommendation("Trajan's Column","Monument with war depictions",R.drawable.column)
        )
    )
    val monuments: StateFlow<List<Recommendation>> = _monuments

    private val _museums = MutableStateFlow(
        listOf(
            Recommendation("Vatican Museums","The Vatican Museums attract nearly 7 million visitors a year.\n" +
                    "\n" +
                    "They house collections of the popes from ancient Egypt to modern times. They also include parts of the Apostolic Palace with rooms painted by Raphael, the chambers of the Borgia Pope and the Sistine Chapel.\n" +
                    "\n" +
                    "The Vatican City Gardens can only be visited with guided tours on foot or with a ride in an open bus. Visits to the gardens can be reserved in addition to admission to the Vatican Museums.",R.drawable.vaticanmuseums),
            Recommendation("Castel Sant’Angelo","At Castel Sant’Angelo there are often long queues and it is recommended to buy the ticket in advance.\n" +
                    "\n" +
                    "At Castel Sant’Angelo there are often long queues and it is recommended to buy the ticket in advance.\n" +
                    "\n" +
                    "The building originated as mausoleum for Emperor Hadrian and was repeatedly modified. Over time, Castel Sant’Angelo has served as a prison and refuge for Popes and as barracks. Some rooms can be visited only with a guided tour.",R.drawable.angelocastle),
            Recommendation("Villa Adriana and Villa D’Este","The two villas are located east of Rome in the village of Tivoli on the slopes of the Apennine Mountains.\n" +
                    "\n" +
                    "They could not be more different. Villa Adriana, dating from the 2nd century AD, was the biggest villa ever built by a Roman emperor, covering some 120 hectares – Villa D’Este was the luxurious 15th-century villa with park and famous water features of Cardinal Ippolito D’Este. When Pope Julius III promoted him to ruler of Tivoli, he found a Spartan monastery there, which he had replaced with the magnificent villa. It is not without reason that many amusement parks today are called Tivoli.",R.drawable.villaadriana),
            Recommendation("Borghese Gallery","The rich Borghese family flaunted their art treasures in their garden villa. Napoleon cleared out the villa and had most of the art treasures moved to the Louvre.\n" +
                    "\n" +
                    "Napoleon’s sister Paolina married the Borghese Prince Camillo. The artist Antonio Canova immortalized Paolina half-naked on a divan. Today it is one of the most photographed works in the gallery.\n" +
                    "\n" +
                    "The Borghese family restocked the looted treasures from their holdings. The gallery can be visited only by reservation.",R.drawable.gallery),
            Recommendation("Palazzo Colonna - Galleria Colonna\n" +
                    "\n" +
                    "\n","Right in the center of Rome, close to Piazza Venezia, Palazzo Colonna is one of the greatest Barocco Palaces of the eternal city. The impressive Colonna's Collections of paintings, sculptures and furniture from the 14th to the 18th century are unique and part of the roman history. The Colonna Gallery is open to the public every Saturday morning from 9 am to 1,15 pm (last entrance) from Via della Pilotta 17. All other days, including Saturday afternoon, private visits by appointment. Free guided tour (every Saturday): - in Italian at 10.00 And 11.00 Am - in French at 10.30 Am - in English at 12 am Private visits on request are available every day of the year. We also recommend a visit to the stunning Princess Isabelle Apartment with its incredible Van Wittel and Flemish Collections and the Pinturicchio frescoes.",R.drawable.palazzocolonna)
        )
    )
    val museums: StateFlow<List<Recommendation>> = _museums

    private val _parks = MutableStateFlow(
        listOf(
            Recommendation("Villa Borghese","Undoubtedly, the Villa Borghese is the most famous park in Rome and is an excellent choice for travelers interested in art. In addition, there is a green space of 200 acres around the Galleria Borghese.\n" +
                    "\n" +
                    "The gardens have a naturalistic English manner; there, you will find many statues, lakes, fountains, and small museums. Some of the most popular attractions of the central villa are the Piazza di Siena horse track, a little lake with an Ionic temple where you can rent a boat, and the Pincio terrace with a panoramic view onto the Piazza del Popolo.",R.drawable.villaborghese),
            Recommendation("Villa Doria Pamphili","Villa Doria Pamphili is located in the Monteverde area and is the largest park in Rome. Initially, it was a suburban villa with a garden that belonged to the papal Pamphili family. The enormous public garden spans over 184 hectares and has a 17th-century Villa. Locals mainly visit the park and is very quiet. There are three areas: the “Urban Part,” “Pars Fractuaria,” and “Rustic Pars.”",R.drawable.villadoriapamphili),
            Recommendation("Appian Way Regional Park","Appia Antica Park is located behind Circus Maximus on one of the oldest roads used in Rome, even in Napoleonic times. It is a 3400-acre park surrounded by history. There is a mix of gardens, aqueducts, tombs, and underground Catacombs with a historical spirit and a peaceful atmosphere. You can easily spend there the whole day, especially during sunny weather.",R.drawable.appianwaypark),
            Recommendation("Vatican Gardens","The Vatican Gardens date back to 1279, when Pope Nicholas III moved the location of the papal residence from the Lateran Palace to the Vatican. Undoubtedly, this is one of the most beautiful and peaceful spots of the Eternal City. Several landscape terraces, unique fountains, and glimpses of Michelangelo’s dome. There are two “Vatican Gardens.” You can visit the gardens right behind St. Peter’s Basilica and at the Papal summer residence at Castel Gandolfo (half an hour outside Rome).",R.drawable.vaticangardens),
            Recommendation("Villa Ada","Villa Ada is a green and peaceful park with a bike rental service, a lake, a café, and an annual live music festival called “Roma Incontra Il Mondo.” Moreover, this is the second-largest park in Rome, with 450 acres and rich flora and fauna. Amazingly thriving cypresses, dwarf palm trees, pines, beautiful swans, and turtles.",R.drawable.villaada)
        )
    )
    val parks: StateFlow<List<Recommendation>> = _parks

    private val _restaurants = MutableStateFlow(
        listOf(
            Recommendation("La Pergola","La Pergola is a renowned three-Michelin-starred restaurant located on the rooftop of the Rome Cavalieri Waldorf Astoria hotel. " +
                    "With breathtaking panoramic views of the city, this elegant restaurant offers a culinary experience like no other. " +
                    "Chef Heinz Beck presents a menu that combines traditional Italian flavors with innovative techniques, creating dishes that are both visually stunning and incredibly delicious. " +
                    "From the impeccable service to the extensive wine list, La Pergola provides a truly unforgettable dining experience.",R.drawable.lapergola),
            Recommendation("Roscioli","Roscioli is a family-run restaurant and deli that has been a staple in Rome for over 100 years. " +
                    "This charming establishment offers a unique dining experience, combining a traditional trattoria with a gourmet food shop. " +
                    "The menu features a variety of Italian classics, including homemade pasta, fresh seafood, and mouthwatering desserts. With its cozy atmosphere and exceptional food, Roscioli is a must-visit for food lovers in Rome.",R.drawable.roscioli),
            Recommendation("Armando al Pantheon","Located just a stone’s throw away from the iconic Pantheon, Armando al Pantheon is a hidden gem that has been serving authentic Roman cuisine since 1961. " +
                    "This family-owned trattoria offers a warm and welcoming atmosphere, making you feel like you’re dining in someone’s home. " +
                    "The menu features traditional dishes such as carbonara, cacio e pepe, and saltimbocca alla Romana, all prepared with the finest ingredients. " +
                    "For a taste of true Roman flavors, Armando al Pantheon is the place to go.",R.drawable.armando),
            Recommendation("Trattoria Da Danilo","Trattoria Da Danilo is a beloved neighborhood restaurant that has been serving delicious Roman cuisine since 1961. " +
                    "Located near the Termini train station, this unassuming trattoria offers a cozy and friendly atmosphere, perfect for a casual meal. " +
                    "The menu features classic Roman dishes, such as amatriciana, coda alla vaccinara, and abbacchio al forno. " +
                    "With its affordable prices and authentic flavors, Trattoria Da Danilo is a favorite among locals and tourists alike.",R.drawable.trattoria),
            Recommendation("Antico Arco","Nestled in the charming neighborhood of Trastevere, Antico Arco offers a contemporary twist on traditional Italian cuisine. " +
                    "This Michelin-starred restaurant showcases the creativity and skill of Chef Patrizia Mattei, who combines seasonal ingredients to create innovative and flavorful dishes. " +
                    "The menu changes regularly to reflect the freshest produce available, ensuring a unique dining experience with every visit. " +
                    "With its modern decor and exceptional food, Antico Arco is a must-try for those looking for a taste of modern Italian cuisine.",R.drawable.anticoarco)
        )
    )
    val restaurants: StateFlow<List<Recommendation>> = _restaurants
}
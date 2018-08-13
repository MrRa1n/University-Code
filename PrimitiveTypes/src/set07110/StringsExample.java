package set07110;

public class StringsExample {

	/**
	 * A String array defined as a static instance variable called data;
	 */
	public static String[] data = { "Achelous", "Ares", "Clytemnestra", "Eurystheus", "Icarus", "Naiads", "Phlegethon", "Sterope",
			"Acheron", "Argo", "Cocytus", "Euterpe", "Io", "Napaeae", "Phosphor", "Stheno", "Achilles", "Argus",
			"Creon", "Favonius", "Iobates", "Narcissus", "Phrixos", "Styx", "Actaeon", "Ariadne", "Cre�sa", "Furies",
			"Iphigenia", "Nemesis", "Pirithous", "Symplegades", "Admetus", "Arion", "Creusa", "Gaea", "Iris",
			"Neoptolemus", "Pleiades", "Syrinx", "Adonis", "Artemis", "Cronus", "Galatea", "Ismene", "Nereids", "Pluto",
			"Tantalus", "Aeacus", "Asclepius", "Cybele", "Ganymede", "Iulus", "Nestor", "Plutus", "Tartarus", "Aegeus",
			"Astarte", "Cyclopes", "Glaucus", "Ixion", "Nike", "Pollux", "Taygeta", "Aegisthus", "Astraea", "Daedalus",
			"Graces", "Jason", "Niobe", "Polymnia", "Telemachus", "Aegyptus", "Atalanta", "Danae", "Graeae", "Jocasta",
			"Nona", "Polynices", "Terpsichore", "Aeneas", "Athena", "Daphne", "Hades", "Lachesis", "Notus",
			"Polyphemus", "Thalia", "Aeolus", "Atlas", "Decuma", "Haemon", "Laius", "Nymphs", "Polyxena", "Thanatos",
			"Aeson", "Atreus", "Deino", "Hamadryads", "Laoco�n", "Nyx", "Pontus", "Themis", "Aether", "Atropos",
			"Demeter", "Harpies", "Lavinia", "Oceanids", "Poseidon", "Theseus", "Aethra", "Auster", "Dido", "Hebe",
			"Leander", "Oceanus", "Priam", "Thisbe", "Agamemnon", "Avernus", "Diomedes", "Hecate", "Leda", "Odysseus",
			"Priapus", "Thyestes", "Aglaia", "Bellerophon", "Dione", "Hector", "Lethe", "Oedipus", "Procris",
			"Tiresias", "Ajax", "Boreas", "Dionysus", "Hecuba", "Leto", "Oenone", "Procrustes", "Tisiphone", "Alcestis",
			"Briareus", "Dioscuri", "Helen", "Lynceus", "Oreads", "Proetus", "Titans", "Alcmene", "Briseis", "Dryads",
			"Heliades", "Maia", "Orestes", "Prometheus", "Tithonus", "Alcyone", "Cadmus", "Dryope", "Helios", "Marsyas",
			"Orion", "Proteus", "Triton", "Alecto", "Calliope", "Echo", "Helle", "Medea", "Orpheus", "Psyche", "Turnus",
			"Alectryon", "Calypso", "Electra", "Hephaestus", "Medusa", "Palinurus", "Pygmalion", "Urania", "Althaea",
			"Cassandra", "Elysium", "Hera", "Megaera", "Pan", "Pyramus", "Uranus", "Amazons", "Castor", "Endymion",
			"Hercules", "Meleager", "Pandora", "Python", "Winds", "Amphion", "Celaeno", "Enyo", "Hermes", "Melpomene",
			"Parcae", "Remus", "Zephyrus", "Amphitrite", "Centaurs", "Eos", "Hero", "Memnon", "Paris", "Rhadamanthus",
			"Zeus", "Amphitryon", "Cephalus", "Epimetheus", "Hesperus", "Menelaus", "Patroclus", "Rhea", "Anchises",
			"Cepheus", "Erato", "Hestia", "Mentor", "Pegasus", "Sarpedon", "Ancile", "Cerberus", "Erebus", "Hippolyte",
			"Merope", "Pelias", "Satyrs", "Andraemon", "Chaos", "Erinyes", "Hippolytus", "Mezentius", "Pelops",
			"Sciron", "Andromache", "Charon", "Eris", "Hippomenes", "Midas", "Penelope", "Scylla", "Andromeda",
			"Charybdis", "Eros", "Hyacinthus", "Minos", "Pephredo", "Selene", "Anteia", "Chimera", "Eteocles", "Hydra",
			"Minotaur", "Periphetes", "Semele", "Anteros", "Chiron", "Eumenides", "Hygeia", "Mnemosyne", "Persephone",
			"Sibyis", "Antigone", "Chronos", "Euphrosyne", "Hymen", "Moirae", "Perseus", "Sileni", "Aphrodite",
			"Chryseis", "Europa", "Hyperion", "Momus", "Phaedra", "Sinis", "Apollo", "Circe", "Eurus", "Hypermnestra",
			"Morpheus", "Phaethon", "Sirens", "Aquilo", "Clio", "Euryale", "Hypnos", "Morta", "Philoctetes", "Sisyphus",
			"Arachne", "Clotho", "Eurydice", "Iapetus", "Muses", "Phineus", "Sphinx" };
	
	
	public static void main(String[] args) {
		
		System.out.println("The length of the array is " + data.length);
		
		for(String name : data){
			System.out.println(name);
		}
		
		// 1. Two character name
		for (String name : data) {
			if (name.length() == 2) {
				System.out.println("The only two letter name is " + name);
			}
		}
		
		// 2. Name ends with "seus"
		System.out.println("The following names end with \"seus\"");
		for (String name : data) {
			if (name.endsWith("seus")) {
				System.out.println(name);
			}
		}
		
		// 3. 9 letter names ending with "a"
		System.out.println("Names that have 9 letters and end with 'a'");
		for (String name : data) {
			if (name.length() == 9 && name.endsWith("a")) {
				System.out.println(name);
			}
		}
		// 4. Names with 'm' as second letter
		System.out.println("Names with second letter 'm'");
		for (String name : data) {
			if (name.charAt(1) == 'm') {
				System.out.println(name);
			}
		}
		// 5. Names that contain 'x'
		System.out.println("Names that contain 'x' and do not end with 'x'");
		for (String name : data) {
			if (name.contains("x") && !name.endsWith("x")) {
				System.out.println(name);
			}
		}
	}

}

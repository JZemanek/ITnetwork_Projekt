/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itnetwork.cz.projektjavazjednodusenaverze;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * Třída s hlavními metodami
 */
public class Evidence {

    Scanner scanner = new Scanner(System.in, "Windows-1250");

    //Kompletní seznam pojištěných
    private ArrayList<Pojisteny> seznamPojistenych = new ArrayList<>();

    //Výpis hlavního menu

    /**
     *
     */
    public void vypisMenu() {
        System.out.println("-----------------------------");
        System.out.println("Evidence pojištěných");
        System.out.println("-----------------------------");
        System.out.println();
        System.out.println("Vyberte si akci:");
        System.out.println("1 - Přidat nového pojištěného");
        System.out.println("2 - Vypsat všechny pojištěné");
        System.out.println("3 - Vyhledat pojištěného");
        System.out.println("4 - Konec");
    }

    //Hlavní program

    /**
     *
     */
    public void programEvidence() {
        String vstup = "";
        while (!vstup.equals("konec")) {
            //Vypíše hlavní menu
            vypisMenu();
            //Vstup
            vstup = scanner.nextLine();
            switch (vstup) {
                case "1" ->
                    //Přidá nového pojištěného
                    pridejPojisteneho();
                case "2" ->
                    //Vypíše všechny pojištěnce
                    vypisPojistene();
                case "3" ->
                    //Vyhledá pojištěného na základě zadaných informací
                    vyhledejPojisteneho();
                case "4" -> {
                    //Ukončí program
                    vstup = "konec";
                    System.out.println("Program byl ukončen. Děkujeme, že využíváte naše služby.");
                }
                default ->
                    //V případě chybného zadání vypíše zprávu
                    System.out.println("Neplatná volba");
            }
        }
    }

    /**
     * Metoda pro vytvoření pojištěného Vytvoří pojištěného s vloženými
     * parametry a následně ho přidá do kolekce
     */
    public void pridejPojisteneho() {
        //Hodnota pro určení opakování cyklu.
        boolean kontrolaHodnot = false;
        //Cyklus pro opakování zadávání do doby, než budou všechny parametry správně zadané.
        while (kontrolaHodnot == false) {
            //Zkontroluje zadané parametry
            try {
                System.out.println();

                System.out.println("Zadejte jméno pojištěného:");
                //Zadání jména
                String jmeno = scanner.nextLine();

                System.out.println("Zadejte příjmení:");
                //Zadání příjmení
                String prijmeni = scanner.nextLine();

                System.out.println("Zadejte věk:");
                //Zadání věku
                int vek = Integer.parseInt(scanner.nextLine());

                System.out.println("Zadejte telefonní číslo:");
                //Zadání tel čísla
                String telefon = scanner.nextLine();

                //Vytvoření pojištěného a přidání do kolekce
                seznamPojistenych.add(new Pojisteny(jmeno, prijmeni, vek, telefon));

                //Nastaví hodnotu na true aby se ukončil cyklus.
                kontrolaHodnot = true;
            } catch (Exception e) {
                //V případě chyby v parametrech vypíše chybovou zprávu a zadávání se opakuje.
                System.out.println("Chyba při zadávání. Zkontrolujte zadané hodnoty a akci opakujte.");
                //Nastaví hodnotu na false, aby se cyklus opakoval.
                kontrolaHodnot = false;
            }
        }
    }

    /**
     * Metoda pro vypsání všech pojištěných
     */
    public void vypisPojistene() {
        System.out.println();

        //Cyklus pro projití kolekce a vypsání každého objektu na základě indexu
        for (int i = 0; i < seznamPojistenych.size(); i++) {
            System.out.println(seznamPojistenych.get(i));
        }
    }

    /**
     * Metoda pro vyhledání pojištěného na základě zadaných parametrů.
     */
    public void vyhledejPojisteneho() {
        System.out.println();

        System.out.println("Zadej jméno:");
        //Zadání jména pojištěného
        String jmeno = scanner.nextLine().toLowerCase();
        System.out.println("Zadej příjmení:");
        //Zadání příjmení pojištěného
        String prijmeni = scanner.nextLine().toLowerCase();

        //Prohledání seznamu na základě jména a příjmení.
        for (Pojisteny hledany : seznamPojistenych) {
            //Kontrola zadaných hodnot
            if (hledany.getJmeno().toLowerCase().equals(jmeno) && hledany.getPrijmeni().toLowerCase().equals(prijmeni)) {
                //Vypsání pojištěného pokud je nalezen.
                System.out.println(hledany);
            } else if (!seznamPojistenych.contains(hledany)) {
                //Vypsání věty, pokud pojištěný neexistuje.
                System.out.println("Pojištěný nebyl nalezen");
            }
        }
    }
}

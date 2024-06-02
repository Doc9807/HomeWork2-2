import model.GryffindorStudent;
import model.HufflepuffStudent;
import model.RavenclawStudent;
import model.SlytherinStudent;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nАкадемия Чародейства и Волшебства Хогвартс.\n");

        GryffindorStudent harryPotter = new GryffindorStudent("Гарри Потер", 10, 12,
                6, 7, 10);
        GryffindorStudent hermioneGranger = new GryffindorStudent("Гермиона Грейнджер", 8,
                10, 5, 5, 6);
        GryffindorStudent ronWeasley = new GryffindorStudent("Рон Уизли", 6, 8,
                3, 6, 5);

        HufflepuffStudent zachariahSmith = new HufflepuffStudent("Захария Смит", 4,
                4, 3, 2, 1);
        HufflepuffStudent cedricDiggory = new HufflepuffStudent("Седрик Диггори", 7,
                6, 5, 4, 5);
        HufflepuffStudent justinFinchFletchley = new HufflepuffStudent("Джастин Финч-Флетчли", 2,
                6, 4, 2, 2);

        RavenclawStudent zhouChang = new RavenclawStudent("Чжоу Чанг", 5, 2,
                1, 8, 6, 4);
        RavenclawStudent padmaPatil = new RavenclawStudent("Падма Патил", 3, 5,
                6, 3, 1, 3);
        RavenclawStudent marcusBelby = new RavenclawStudent("Маркус Белби", 9, 2,
                5, 5, 8, 2);

        SlytherinStudent dracoMalfoy = new SlytherinStudent("Драко Малфой", 7, 5,
                7, 6, 8, 4, 8);
        SlytherinStudent grahamMontague = new SlytherinStudent("Грэхэм Монтегю", 4,
                6, 4, 2, 5, 3, 4);
        SlytherinStudent gregoryGoyle = new SlytherinStudent("Грегори Гойл", 3, 6,
                2, 5, 3, 1, 4);


        System.out.println(harryPotter + "\n" + hermioneGranger + "\n" +
                ronWeasley + "\n" + zachariahSmith + "\n" +
                cedricDiggory + "\n" +
                justinFinchFletchley + "\n" +
                zhouChang + "\n" +
                padmaPatil + "\n" +
                marcusBelby + "\n" +
                dracoMalfoy + "\n" +
                grahamMontague + "\n" +
                gregoryGoyle + "\n");


        hermioneGranger.printGryffindorDifferenceProperties(harryPotter);
        zachariahSmith.printHufflepuffDifferenceProperties(justinFinchFletchley);
        marcusBelby.printRavenclawDifferenceProperties(zhouChang);
        dracoMalfoy.printSlytherinDifferenceProperties(gregoryGoyle);

        System.out.println();
        zhouChang.printPowerDifference(harryPotter);
        dracoMalfoy.printPowerDifference(hermioneGranger);
        cedricDiggory.printPowerDifference(grahamMontague);
        ronWeasley.printPowerDifference(marcusBelby);
        padmaPatil.printPowerDifference(justinFinchFletchley);

    }
}
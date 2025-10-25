public class Theatre {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Глеб", "Калюжный", Gender.MALE, 27);
        Actor actor2 = new Actor("Юрий", "Стоянов", Gender.MALE, 68);
        Actor actor3 = new Actor("Ольга", "Медынич", Gender.FEMALE, 43);

        Director director1 = new Director("Антон", "Маслов", Gender.MALE, 10);
        Director director2 = new Director("Дмитрий", "Грибанов", Gender.MALE, 10);

        Person musicAuthor1 = new Person("Иван", "Канаев", Gender.MALE);
        Person choreographer1 = new Person("Юрий", "Григорович", Gender.MALE);

        Show CentralRussiaIsVampires = new Show("Вампиры средней полосы", 60, director1);
        Ballet SwanLake = new Ballet("Лебединое озеро", 60, director2, musicAuthor1, "Либретто " +
                "балета \"Лебединое озеро\" рассказывает о принце Зигфриде, который влюбляется в принцессу-лебедь " +
                "Одетту, заколдованную злым волшебником Ротбартом. На балу он, обманутый дочерью Ротбарта Одиллией, " +
                "похожей на Одетту, клянется ей в любви. Поняв свой роковой обман, Зигфрид бежит к озеру, чтобы " +
                "попросить прощения у Одетты, но их счастью мешают чары Ротбарта, и в финале, в зависимости от " +
                "постановки, погибают либо оба, либо только один из них. ", choreographer1);
        Opera Carmen = new Opera("Кармен", 60, director1, musicAuthor1, "Действие оперы " +
                "происходит в Испании в первой половине XIX века. Основные персонажи: цыганка Кармен, сержант дон " +
                "Хозе, тореадор Эскамильо и невеста Хозе Микаэла. Помимо них в опере представлен ряд второстепенных " +
                "персонажей: офицеры, солдаты, цыгане, контрабандисты, тореадоры, владелец таверны и простой народ",
                2);

        CentralRussiaIsVampires.newActor(actor1);
        CentralRussiaIsVampires.newActor(actor2);
        CentralRussiaIsVampires.newActor(actor3);

        SwanLake.newActor(actor1);
        SwanLake.newActor(actor2);

        Carmen.newActor(actor2);
        Carmen.newActor(actor3);

        System.out.println(CentralRussiaIsVampires.title + ". Список актеров:");
        CentralRussiaIsVampires.printListOfActors();
        System.out.println(SwanLake.title + ". Список актеров:");
        SwanLake.printListOfActors();
        System.out.println(Carmen.title + ". Список актеров:");
        Carmen.printListOfActors();

        Carmen.replaceActor(actor2, actor1);

        System.out.println(CentralRussiaIsVampires.title + ". Список актеров:");
        CentralRussiaIsVampires.printListOfActors();
        System.out.println(SwanLake.title + ". Список актеров:");
        SwanLake.printListOfActors();
        System.out.println(Carmen.title + ". Список актеров:");
        Carmen.printListOfActors();

        SwanLake.replaceActor(actor3, actor1);

        System.out.println(CentralRussiaIsVampires.title + ". Список актеров:");
        CentralRussiaIsVampires.printListOfActors();
        System.out.println(SwanLake.title + ". Список актеров:");
        SwanLake.printListOfActors();
        System.out.println(Carmen.title + ". Список актеров:");
        Carmen.printListOfActors();

        System.out.println("Либретто Лебединое озеро:");
        SwanLake.printLibrettoText();
        System.out.println("Либретто Кармен:");
        Carmen.printLibrettoText();

    }
}

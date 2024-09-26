package ru.gb;

import ru.gb.Fabric.*;
import ru.gb.Interface.IGameItem;
import ru.gb.Product.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        List<ItemGenerator> itemGeneratorList = new ArrayList<>();

        itemGeneratorList.add(new GoldGenerator());
        itemGeneratorList.add(new SilverGenerator());
        itemGeneratorList.add(new GemGenerator());
        itemGeneratorList.add(new AlexandriteGenerator());
        itemGeneratorList.add(new PearlGenerator());
        itemGeneratorList.add(new RubyGenerator());
        itemGeneratorList.add(new SapphireGenerator());
        itemGeneratorList.add(new EmeraldGenerator());

        Random rnd = ThreadLocalRandom.current();

        int silverCnt = 10;
        int emeraldCnt = 10;
        int rubyCnt = 10;
        int sapphireCnt = 10;
        int alexandriteCnt = 10;
        int pearlCnt = 10;
        int goldCnt = 3;
        int gemCnt = 1;

        while (silverCnt + goldCnt + gemCnt + emeraldCnt + alexandriteCnt + rubyCnt + pearlCnt + sapphireCnt > 0) {
            IGameItem item = itemGeneratorList.get(rnd.nextInt(itemGeneratorList.size())).getReward();

            if ( item instanceof SilverReward && silverCnt != 0) {
                silverCnt = silverCnt - 1;
                item.open();
            }

            if ( item instanceof GoldReward && goldCnt != 0) {
                goldCnt = goldCnt - 1;
                item.open();
            }

            if ( item instanceof GemReward && gemCnt != 0) {
                gemCnt = gemCnt - 1;
                item.open();
            }

            if ( item instanceof AlexandriteReward && alexandriteCnt != 0) {
                alexandriteCnt = alexandriteCnt - 1;
                item.open();
            }

            if ( item instanceof EmeraldReward && emeraldCnt != 0) {
                emeraldCnt = emeraldCnt - 1;
                item.open();
            }
            if ( item instanceof PearlReward && pearlCnt != 0) {
                pearlCnt = pearlCnt - 1;
                item.open();
            }

            if ( item instanceof RubyReward && rubyCnt != 0) {
                rubyCnt = rubyCnt - 1;
                item.open();
            }

            if ( item instanceof SapphireReward && sapphireCnt != 0) {
                sapphireCnt = sapphireCnt - 1;
                item.open();
            }
        }
    }
}
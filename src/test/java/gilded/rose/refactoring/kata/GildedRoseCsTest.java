package gilded.rose.refactoring.kata;

import org.approvaltests.combinations.CombinationApprovals;
import org.junit.jupiter.api.Test;

public class GildedRoseCsTest {

    @Test
    public void updateQuality() {
        //        Approvals.verify(itemString);
        CombinationApprovals.verifyAllCombinations(
                this::doUpdateQuality,
                new String[]{"+5 Dexterity Vest", "Aged Brie", "Backstage passes to a TAFKAL80ETC concert",
                },
                new Integer[]{-1, 0, 1, 4, 5, 11},
                new Integer[]{0, 1, 2, 3, 20, 46, 47, 48, 49, 50}
        );
    }

    private String doUpdateQuality(String name, int sellIn, int quality) {
        ItemCs[] items = new ItemCs[]{
                new ItemCs(name, sellIn, quality)};


        GildedRoseCs app = new GildedRoseCs(items);
        app.updateQuality();
        return app.items[0].toString();
    }
}

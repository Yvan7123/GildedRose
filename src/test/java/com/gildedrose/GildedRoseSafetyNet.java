package com.gildedrose;


import org.junit.Test;

import com.google.common.io.Files;
import static com.google.common.base.Charsets.UTF_8;
import java.io.File;

public class GildedRoseSafetyNet {
    @Test
    public void should_always_align_with_baseline() {
        String output = TextTestFixture.getBaseline();
        Files.toString(new File("src/test/baseline.txt", UTF_8))
    }

}

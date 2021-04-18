package com.gildedrose;


import org.junit.Test;

import com.google.common.io.Files;
import static com.google.common.base.Charsets.UTF_8;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.io.File;
import java.io.IOException;

public class GildedRoseSafetyNet {
    @Test
    public void should_always_align_with_baseline() throws IOException {
        String output = TextTestFixture.getBaseline();
        String baseline = Files.toString(new File("src/test/baseline.txt"), UTF_8);
        assertThat(output, is(baseline));
    }

}

package com.github.cythara.violin.violinMajorArpeggios;

import com.github.cythara.Note;
import com.github.cythara.NoteName;
import com.github.cythara.TypeOfScalesOrArpeggios;

import static com.github.cythara.NoteName.*;

public class ViolinEFlatMajorArpeggio implements TypeOfScalesOrArpeggios {

    @Override
    public Note[] getNotes() {
        return Pitch.values();
    }

    @Override
    public Note findNote(String name) {
        return Pitch.valueOf(name);
    }

    private enum Pitch implements Note {
        E4_FLAT(E, 4, "b", 311.13f),
        G4(G, 4, 392.00f),
        B4_FLAT(B, 4, "b", 466.16f),

        E5_FLAT(E, 5, "b", 622.25f),
        G5(G, 5, 783.99f),
        B5_FLAT(B, 5, "b", 932.33f),

        E6_FLAT(E, 6, "b", 1244.5f),
        G6(G, 6, 1568.0f),
        B6_FLAT(B, 6, "b", 1864.7f),

        E7_FLAT(E, 7, "b", 2489.0f);

        private final String sign;
        private final int octave;
        private final float frequency;
        private NoteName name;

        Pitch(NoteName name, int octave, String sign, float frequency) {
            this.name = name;
            this.octave = octave;
            this.sign = sign;
            this.frequency = frequency;
        }

        Pitch(NoteName name, int octave, float frequency) {
            this.name = name;
            this.octave = octave;
            this.sign = "";
            this.frequency = frequency;
        }

        public NoteName getName() {
            return name;
        }

        public float getFrequency() {
            return frequency;
        }

        @Override
        public int getOctave() {
            return octave;
        }

        @Override
        public String getSign() {
            return sign;
        }
    }
}
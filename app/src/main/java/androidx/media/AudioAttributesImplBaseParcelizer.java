package androidx.media;

import com.daaw.AbstractC0413Bd1;

/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(AbstractC0413Bd1 abstractC0413Bd1) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = abstractC0413Bd1.p(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = abstractC0413Bd1.p(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = abstractC0413Bd1.p(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = abstractC0413Bd1.p(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, AbstractC0413Bd1 abstractC0413Bd1) {
        abstractC0413Bd1.x(false, false);
        abstractC0413Bd1.F(audioAttributesImplBase.a, 1);
        abstractC0413Bd1.F(audioAttributesImplBase.b, 2);
        abstractC0413Bd1.F(audioAttributesImplBase.c, 3);
        abstractC0413Bd1.F(audioAttributesImplBase.d, 4);
    }
}

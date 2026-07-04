package androidx.media;

import android.media.AudioAttributes;
import com.daaw.AbstractC0413Bd1;

/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(AbstractC0413Bd1 abstractC0413Bd1) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) abstractC0413Bd1.r(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = abstractC0413Bd1.p(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, AbstractC0413Bd1 abstractC0413Bd1) {
        abstractC0413Bd1.x(false, false);
        abstractC0413Bd1.H(audioAttributesImplApi21.a, 1);
        abstractC0413Bd1.F(audioAttributesImplApi21.b, 2);
    }
}

package androidx.media;

import com.daaw.AbstractC0413Bd1;

/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC0413Bd1 abstractC0413Bd1) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.a = (AudioAttributesImpl) abstractC0413Bd1.v(audioAttributesCompat.a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC0413Bd1 abstractC0413Bd1) {
        abstractC0413Bd1.x(false, false);
        abstractC0413Bd1.M(audioAttributesCompat.a, 1);
    }
}

package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import com.daaw.AbstractC0413Bd1;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(AbstractC0413Bd1 abstractC0413Bd1) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = abstractC0413Bd1.p(iconCompat.a, 1);
        iconCompat.c = abstractC0413Bd1.j(iconCompat.c, 2);
        iconCompat.d = abstractC0413Bd1.r(iconCompat.d, 3);
        iconCompat.e = abstractC0413Bd1.p(iconCompat.e, 4);
        iconCompat.f = abstractC0413Bd1.p(iconCompat.f, 5);
        iconCompat.g = (ColorStateList) abstractC0413Bd1.r(iconCompat.g, 6);
        iconCompat.i = abstractC0413Bd1.t(iconCompat.i, 7);
        iconCompat.j = abstractC0413Bd1.t(iconCompat.j, 8);
        iconCompat.i();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, AbstractC0413Bd1 abstractC0413Bd1) {
        abstractC0413Bd1.x(true, true);
        iconCompat.j(abstractC0413Bd1.f());
        int i = iconCompat.a;
        if (-1 != i) {
            abstractC0413Bd1.F(i, 1);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            abstractC0413Bd1.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            abstractC0413Bd1.H(parcelable, 3);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            abstractC0413Bd1.F(i2, 4);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            abstractC0413Bd1.F(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            abstractC0413Bd1.H(colorStateList, 6);
        }
        String str = iconCompat.i;
        if (str != null) {
            abstractC0413Bd1.J(str, 7);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            abstractC0413Bd1.J(str2, 8);
        }
    }
}

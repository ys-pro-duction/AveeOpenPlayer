package com.daaw;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7062oO {
    public final AssetManager d;
    public final C5767jm0 a = new C5767jm0();
    public final Map b = new HashMap();
    public final Map c = new HashMap();
    public String e = ".ttf";

    public C7062oO(Drawable.Callback callback, AbstractC6783nO abstractC6783nO) {
        if (callback instanceof View) {
            this.d = ((View) callback).getContext().getAssets();
        } else {
            AbstractC1876Pd0.c("LottieDrawable must be inside of a view for images to work.");
            this.d = null;
        }
    }

    public final Typeface a(String str) {
        Typeface typeface = (Typeface) this.c.get(str);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(this.d, "fonts/" + str + this.e);
        this.c.put(str, typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }

    public Typeface b(String str, String str2) {
        this.a.b(str, str2);
        Typeface typeface = (Typeface) this.b.get(this.a);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceD = d(a(str), str2);
        this.b.put(this.a, typefaceD);
        return typefaceD;
    }

    public final Typeface d(Typeface typeface, String str) {
        boolean zContains = str.contains("Italic");
        boolean zContains2 = str.contains("Bold");
        int i = (zContains && zContains2) ? 3 : zContains ? 2 : zContains2 ? 1 : 0;
        return typeface.getStyle() == i ? typeface : Typeface.create(typeface, i);
    }

    public void c(AbstractC6783nO abstractC6783nO) {
    }
}

package com.daaw;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.gY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4860gY {
    public static final Object d = new Object();
    public final Context a;
    public final String b;
    public final Map c;

    public C4860gY(Drawable.Callback callback, String str, InterfaceC4581fY interfaceC4581fY, Map map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.b = str;
        } else {
            this.b = str + '/';
        }
        if (callback instanceof View) {
            this.a = ((View) callback).getContext();
            this.c = map;
            d(interfaceC4581fY);
        } else {
            AbstractC1876Pd0.c("LottieDrawable must be inside of a view for images to work.");
            this.c = new HashMap();
            this.a = null;
        }
    }

    public Bitmap a(String str) {
        C5732jf0 c5732jf0 = (C5732jf0) this.c.get(str);
        if (c5732jf0 == null) {
            return null;
        }
        Bitmap bitmapA = c5732jf0.a();
        if (bitmapA != null) {
            return bitmapA;
        }
        String strB = c5732jf0.b();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (strB.startsWith("data:") && strB.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(strB.substring(strB.indexOf(44) + 1), 0);
                return c(str, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
            } catch (IllegalArgumentException e) {
                AbstractC1876Pd0.d("data URL did not have correct base64 format.", e);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.b)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                return c(str, AbstractC0301Ab1.l(BitmapFactory.decodeStream(this.a.getAssets().open(this.b + strB), null, options), c5732jf0.e(), c5732jf0.c()));
            } catch (IllegalArgumentException e2) {
                AbstractC1876Pd0.d("Unable to decode image.", e2);
                return null;
            }
        } catch (IOException e3) {
            AbstractC1876Pd0.d("Unable to open asset.", e3);
            return null;
        }
    }

    public boolean b(Context context) {
        return (context == null && this.a == null) || this.a.equals(context);
    }

    public final Bitmap c(String str, Bitmap bitmap) {
        synchronized (d) {
            ((C5732jf0) this.c.get(str)).f(bitmap);
        }
        return bitmap;
    }

    public void d(InterfaceC4581fY interfaceC4581fY) {
    }
}

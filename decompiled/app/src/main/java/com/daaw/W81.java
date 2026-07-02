package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import com.daaw.OO;
import com.daaw.TO;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class W81 {
    public ConcurrentHashMap a = new ConcurrentHashMap();

    public class a implements b {
        public a() {
        }

        @Override // com.daaw.W81.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(TO.b bVar) {
            return bVar.e();
        }

        @Override // com.daaw.W81.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(TO.b bVar) {
            return bVar.f();
        }
    }

    public interface b {
        int a(Object obj);

        boolean b(Object obj);
    }

    public static Object e(Object[] objArr, int i, b bVar) {
        return f(objArr, (i & 1) == 0 ? RCHTTPStatusCodes.BAD_REQUEST : 700, (i & 2) != 0, bVar);
    }

    public static Object f(Object[] objArr, int i, boolean z, b bVar) {
        Object obj = null;
        int i2 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int iAbs = (Math.abs(bVar.a(obj2) - i) * 2) + (bVar.b(obj2) == z ? 0 : 1);
            if (obj == null || i2 > iAbs) {
                obj = obj2;
                i2 = iAbs;
            }
        }
        return obj;
    }

    public abstract Typeface a(Context context, OO.c cVar, Resources resources, int i);

    public abstract Typeface b(Context context, CancellationSignal cancellationSignal, TO.b[] bVarArr, int i);

    public Typeface c(Context context, InputStream inputStream) {
        File fileE = X81.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (X81.d(fileE, inputStream)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i, String str, int i2) {
        File fileE = X81.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (X81.c(fileE, resources, i)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    public TO.b g(TO.b[] bVarArr, int i) {
        return (TO.b) e(bVarArr, i, new a());
    }
}

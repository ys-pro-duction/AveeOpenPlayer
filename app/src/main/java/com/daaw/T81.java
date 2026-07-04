package com.daaw;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import com.daaw.OO;
import com.daaw.TO;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class T81 extends R81 {
    public final Class g;
    public final Constructor h;
    public final Method i;
    public final Method j;
    public final Method k;
    public final Method l;
    public final Method m;

    public T81() {
        Class clsV;
        Constructor constructorW;
        Method methodS;
        Method methodT;
        Method methodX;
        Method methodR;
        Method methodU;
        try {
            clsV = v();
            constructorW = w(clsV);
            methodS = s(clsV);
            methodT = t(clsV);
            methodX = x(clsV);
            methodR = r(clsV);
            methodU = u(clsV);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            clsV = null;
            constructorW = null;
            methodS = null;
            methodT = null;
            methodX = null;
            methodR = null;
            methodU = null;
        }
        this.g = clsV;
        this.h = constructorW;
        this.i = methodS;
        this.j = methodT;
        this.k = methodX;
        this.l = methodR;
        this.m = methodU;
    }

    @Override // com.daaw.R81, com.daaw.W81
    public Typeface a(Context context, OO.c cVar, Resources resources, int i) {
        if (!q()) {
            return super.a(context, cVar, resources, i);
        }
        Object objL = l();
        if (objL == null) {
            return null;
        }
        OO.d[] dVarArrA = cVar.a();
        int length = dVarArrA.length;
        int i2 = 0;
        while (i2 < length) {
            OO.d dVar = dVarArrA[i2];
            String strA = dVar.a();
            int iC = dVar.c();
            int iE = dVar.e();
            boolean zF = dVar.f();
            Context context2 = context;
            if (!n(context2, objL, strA, iC, iE, zF ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.d()))) {
                m(objL);
                return null;
            }
            i2++;
            context = context2;
        }
        if (p(objL)) {
            return i(objL);
        }
        return null;
    }

    @Override // com.daaw.R81, com.daaw.W81
    public Typeface b(Context context, CancellationSignal cancellationSignal, TO.b[] bVarArr, int i) {
        Typeface typefaceI;
        Object obj;
        if (bVarArr.length < 1) {
            return null;
        }
        if (q()) {
            Map mapH = X81.h(context, bVarArr, cancellationSignal);
            Object objL = l();
            if (objL == null) {
                return null;
            }
            int length = bVarArr.length;
            int i2 = 0;
            boolean z = false;
            while (i2 < length) {
                TO.b bVar = bVarArr[i2];
                ByteBuffer byteBuffer = (ByteBuffer) mapH.get(bVar.d());
                if (byteBuffer == null) {
                    obj = objL;
                } else {
                    boolean zO = o(objL, byteBuffer, bVar.c(), bVar.e(), bVar.f() ? 1 : 0);
                    obj = objL;
                    if (!zO) {
                        m(obj);
                        return null;
                    }
                    z = true;
                }
                i2++;
                objL = obj;
            }
            Object obj2 = objL;
            if (!z) {
                m(obj2);
                return null;
            }
            if (p(obj2) && (typefaceI = i(obj2)) != null) {
                return Typeface.create(typefaceI, i);
            }
            return null;
        }
        TO.b bVarG = g(bVarArr, i);
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(bVarG.d(), "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(bVarG.e()).setItalic(bVarG.f()).build();
                parcelFileDescriptorOpenFileDescriptor.close();
                return typefaceBuild;
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // com.daaw.W81
    public Typeface d(Context context, Resources resources, int i, String str, int i2) {
        if (!q()) {
            return super.d(context, resources, i, str, i2);
        }
        Object objL = l();
        if (objL == null) {
            return null;
        }
        if (!n(context, objL, str, 0, -1, -1, null)) {
            m(objL);
            return null;
        }
        if (p(objL)) {
            return i(objL);
        }
        return null;
    }

    public Typeface i(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.m.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final Object l() {
        try {
            return this.h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public final void m(Object obj) {
        try {
            this.l.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean n(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean o(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.j.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean p(Object obj) {
        try {
            return ((Boolean) this.k.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean q() {
        return this.i != null;
    }

    public Method r(Class cls) {
        return cls.getMethod("abortCreation", null);
    }

    public Method s(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public Method t(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public Method u(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public Class v() {
        return Class.forName("android.graphics.FontFamily");
    }

    public Constructor w(Class cls) {
        return cls.getConstructor(null);
    }

    public Method x(Class cls) {
        return cls.getMethod("freeze", null);
    }
}

package com.daaw;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.daaw.n40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6698n40 {
    public static final Logger a = Logger.getLogger(AbstractC6698n40.class.getName());

    /* JADX INFO: renamed from: com.daaw.n40$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC8092s40.values().length];
            a = iArr;
            try {
                iArr[EnumC8092s40.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC8092s40.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[EnumC8092s40.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[EnumC8092s40.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[EnumC8092s40.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[EnumC8092s40.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static Object a(String str) {
        C7256p40 c7256p40 = new C7256p40(new StringReader(str));
        try {
            Object objE = e(c7256p40);
            try {
                return objE;
            } catch (IOException e) {
                return objE;
            }
        } finally {
            try {
                c7256p40.close();
            } catch (IOException e2) {
                a.log(Level.WARNING, "Failed to close", (Throwable) e2);
            }
        }
    }

    public static List b(C7256p40 c7256p40) throws IOException {
        c7256p40.a();
        ArrayList arrayList = new ArrayList();
        while (c7256p40.N()) {
            arrayList.add(e(c7256p40));
        }
        AbstractC7785qy0.u(c7256p40.y0() == EnumC8092s40.END_ARRAY, "Bad token: " + c7256p40.i());
        c7256p40.o();
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static Void c(C7256p40 c7256p40) throws IOException {
        c7256p40.q0();
        return null;
    }

    public static Map d(C7256p40 c7256p40) throws IOException {
        c7256p40.c();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (c7256p40.N()) {
            linkedHashMap.put(c7256p40.o0(), e(c7256p40));
        }
        AbstractC7785qy0.u(c7256p40.y0() == EnumC8092s40.END_OBJECT, "Bad token: " + c7256p40.i());
        c7256p40.s();
        return DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    public static Object e(C7256p40 c7256p40) {
        AbstractC7785qy0.u(c7256p40.N(), "unexpected end of JSON");
        switch (a.a[c7256p40.y0().ordinal()]) {
            case 1:
                return b(c7256p40);
            case 2:
                return d(c7256p40);
            case 3:
                return c7256p40.w0();
            case 4:
                return Double.valueOf(c7256p40.Y());
            case 5:
                return Boolean.valueOf(c7256p40.W());
            case 6:
                return c(c7256p40);
            default:
                throw new IllegalStateException("Bad token: " + c7256p40.i());
        }
    }
}

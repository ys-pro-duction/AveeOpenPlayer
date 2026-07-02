package com.daaw;

import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Ig0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1161Ig0 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.daaw.Ig0$a */
    public static abstract class a implements InterfaceC4264eR {
        public static final a B = new C0070a("KEY", 0);
        public static final a C = new b("VALUE", 1);
        public static final /* synthetic */ a[] D = a();

        /* JADX INFO: renamed from: com.daaw.Ig0$a$a, reason: collision with other inner class name */
        public enum C0070a extends a {
            public C0070a(String str, int i) {
                super(str, i, null);
            }

            @Override // com.daaw.InterfaceC4264eR
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getKey();
            }
        }

        /* JADX INFO: renamed from: com.daaw.Ig0$a$b */
        public enum b extends a {
            public b(String str, int i) {
                super(str, i, null);
            }

            @Override // com.daaw.InterfaceC4264eR
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getValue();
            }
        }

        public a(String str, int i) {
        }

        public static /* synthetic */ a[] a() {
            return new a[]{B, C};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) D.clone();
        }

        public /* synthetic */ a(String str, int i, AbstractC1057Hg0 abstractC1057Hg0) {
            this(str, i);
        }
    }

    public static boolean a(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static String b(Map map) {
        StringBuilder sbA = AbstractC1288Jm.a(map.size());
        sbA.append('{');
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z) {
                sbA.append(", ");
            }
            sbA.append(entry.getKey());
            sbA.append('=');
            sbA.append(entry.getValue());
            z = false;
        }
        sbA.append('}');
        return sbA.toString();
    }

    public static InterfaceC4264eR c() {
        return a.C;
    }
}

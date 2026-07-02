package com.daaw;

import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.daaw.zT0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C10158zT0 implements InterfaceC0741Ef0 {
    public static final Bitmap.Config[] d = {Bitmap.Config.ARGB_8888, null};
    public static final Bitmap.Config[] e = {Bitmap.Config.RGB_565};
    public static final Bitmap.Config[] f = {Bitmap.Config.ARGB_4444};
    public static final Bitmap.Config[] g = {Bitmap.Config.ALPHA_8};
    public final c a = new c();
    public final C3719cU b = new C3719cU();
    public final Map c = new HashMap();

    /* JADX INFO: renamed from: com.daaw.zT0$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.zT0$b */
    public static final class b implements InterfaceC0813Ex0 {
        public final c a;
        public int b;
        public Bitmap.Config c;

        public b(c cVar) {
            this.a = cVar;
        }

        @Override // com.daaw.InterfaceC0813Ex0
        public void a() {
            this.a.c(this);
        }

        public void c(int i, Bitmap.Config config) {
            this.b = i;
            this.c = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.b == bVar.b) {
                    Bitmap.Config config = this.c;
                    Bitmap.Config config2 = bVar.c;
                    if (config == null) {
                        if (config2 == null) {
                            return true;
                        }
                    } else if (config.equals(config2)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            int i = this.b * 31;
            Bitmap.Config config = this.c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C10158zT0.i(this.b, this.c);
        }
    }

    /* JADX INFO: renamed from: com.daaw.zT0$c */
    public static class c extends AbstractC8803ue {
        @Override // com.daaw.AbstractC8803ue
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a() {
            return new b(this);
        }

        public b e(int i, Bitmap.Config config) {
            b bVar = (b) b();
            bVar.c(i, config);
            return bVar;
        }
    }

    public static String i(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    public static Bitmap.Config[] j(Bitmap.Config config) {
        int i = a.a[config.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? new Bitmap.Config[]{config} : g : f : e : d;
    }

    @Override // com.daaw.InterfaceC0741Ef0
    public void a(Bitmap bitmap) {
        b bVarE = this.a.e(AbstractC6559mb1.f(bitmap), bitmap.getConfig());
        this.b.d(bVarE, bitmap);
        NavigableMap navigableMapK = k(bitmap.getConfig());
        Integer num = (Integer) navigableMapK.get(Integer.valueOf(bVarE.b));
        navigableMapK.put(Integer.valueOf(bVarE.b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // com.daaw.InterfaceC0741Ef0
    public Bitmap b(int i, int i2, Bitmap.Config config) {
        int iE = AbstractC6559mb1.e(i, i2, config);
        Bitmap bitmap = (Bitmap) this.b.a(h(this.a.e(iE, config), iE, config));
        if (bitmap != null) {
            g(Integer.valueOf(AbstractC6559mb1.f(bitmap)), bitmap.getConfig());
            bitmap.reconfigure(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        }
        return bitmap;
    }

    @Override // com.daaw.InterfaceC0741Ef0
    public String c(int i, int i2, Bitmap.Config config) {
        return i(AbstractC6559mb1.e(i, i2, config), config);
    }

    @Override // com.daaw.InterfaceC0741Ef0
    public int d(Bitmap bitmap) {
        return AbstractC6559mb1.f(bitmap);
    }

    @Override // com.daaw.InterfaceC0741Ef0
    public String e(Bitmap bitmap) {
        return i(AbstractC6559mb1.f(bitmap), bitmap.getConfig());
    }

    public final void g(Integer num, Bitmap.Config config) {
        NavigableMap navigableMapK = k(config);
        Integer num2 = (Integer) navigableMapK.get(num);
        if (num2.intValue() == 1) {
            navigableMapK.remove(num);
        } else {
            navigableMapK.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.daaw.C10158zT0.b h(com.daaw.C10158zT0.b r8, int r9, android.graphics.Bitmap.Config r10) {
        /*
            r7 = this;
            android.graphics.Bitmap$Config[] r0 = j(r10)
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L46
            r3 = r0[r2]
            java.util.NavigableMap r4 = r7.k(r3)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            java.lang.Object r4 = r4.ceilingKey(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L43
            int r5 = r4.intValue()
            int r6 = r9 * 8
            if (r5 > r6) goto L43
            int r0 = r4.intValue()
            if (r0 != r9) goto L33
            if (r3 != 0) goto L2d
            if (r10 == 0) goto L46
            goto L33
        L2d:
            boolean r9 = r3.equals(r10)
            if (r9 != 0) goto L46
        L33:
            com.daaw.zT0$c r9 = r7.a
            r9.c(r8)
            com.daaw.zT0$c r8 = r7.a
            int r9 = r4.intValue()
            com.daaw.zT0$b r8 = r8.e(r9, r3)
            return r8
        L43:
            int r2 = r2 + 1
            goto L6
        L46:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C10158zT0.h(com.daaw.zT0$b, int, android.graphics.Bitmap$Config):com.daaw.zT0$b");
    }

    public final NavigableMap k(Bitmap.Config config) {
        NavigableMap navigableMap = (NavigableMap) this.c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.c.put(config, treeMap);
        return treeMap;
    }

    @Override // com.daaw.InterfaceC0741Ef0
    public Bitmap removeLast() {
        Bitmap bitmap = (Bitmap) this.b.f();
        if (bitmap != null) {
            g(Integer.valueOf(AbstractC6559mb1.f(bitmap)), bitmap.getConfig());
        }
        return bitmap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.b);
        sb.append(", sortedSizes=(");
        for (Map.Entry entry : this.c.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}

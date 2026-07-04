package androidx.work;

import com.daaw.AbstractC1772Od0;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final String b = AbstractC1772Od0.f("Data");
    public static final b c = new a().a();
    public Map a;

    public static final class a {
        public Map a = new HashMap();

        public b a() throws Throwable {
            b bVar = new b(this.a);
            b.k(bVar);
            return bVar;
        }

        public a b(String str, Object obj) {
            if (obj == null) {
                this.a.put(str, null);
                return this;
            }
            Class<?> cls = obj.getClass();
            if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                this.a.put(str, obj);
                return this;
            }
            if (cls == boolean[].class) {
                this.a.put(str, b.a((boolean[]) obj));
                return this;
            }
            if (cls == byte[].class) {
                this.a.put(str, b.b((byte[]) obj));
                return this;
            }
            if (cls == int[].class) {
                this.a.put(str, b.e((int[]) obj));
                return this;
            }
            if (cls == long[].class) {
                this.a.put(str, b.f((long[]) obj));
                return this;
            }
            if (cls == float[].class) {
                this.a.put(str, b.d((float[]) obj));
                return this;
            }
            if (cls != double[].class) {
                throw new IllegalArgumentException(String.format("Key %s has invalid type %s", str, cls));
            }
            this.a.put(str, b.c((double[]) obj));
            return this;
        }

        public a c(b bVar) {
            d(bVar.a);
            return this;
        }

        public a d(Map map) {
            for (Map.Entry entry : map.entrySet()) {
                b((String) entry.getKey(), entry.getValue());
            }
            return this;
        }

        public a e(String str, String str2) {
            this.a.put(str, str2);
            return this;
        }
    }

    public b(b bVar) {
        this.a = new HashMap(bVar.a);
    }

    public static Boolean[] a(boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i = 0; i < zArr.length; i++) {
            boolArr[i] = Boolean.valueOf(zArr[i]);
        }
        return boolArr;
    }

    public static Byte[] b(byte[] bArr) {
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = Byte.valueOf(bArr[i]);
        }
        return bArr2;
    }

    public static Double[] c(double[] dArr) {
        Double[] dArr2 = new Double[dArr.length];
        for (int i = 0; i < dArr.length; i++) {
            dArr2[i] = Double.valueOf(dArr[i]);
        }
        return dArr2;
    }

    public static Float[] d(float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            fArr2[i] = Float.valueOf(fArr[i]);
        }
        return fArr2;
    }

    public static Integer[] e(int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    public static Long[] f(long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            lArr[i] = Long.valueOf(jArr[i]);
        }
        return lArr;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:30:0x0031
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static androidx.work.b g(byte[] r5) {
        /*
            int r0 = r5.length
            r1 = 10240(0x2800, float:1.4349E-41)
            if (r0 > r1) goto L50
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r5)
            r5 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L35 java.lang.Throwable -> L39
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L35 java.lang.Throwable -> L39
            int r5 = r2.readInt()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
        L19:
            if (r5 <= 0) goto L2e
            java.lang.String r3 = r2.readUTF()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
            java.lang.Object r4 = r2.readObject()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
            int r5 = r5 + (-1)
            goto L19
        L29:
            r5 = move-exception
            goto L3b
        L2b:
            r5 = r2
            goto L44
        L2e:
            r2.close()     // Catch: java.io.IOException -> L31
        L31:
            r1.close()     // Catch: java.io.IOException -> L4a
            goto L4a
        L35:
            r0 = move-exception
            r2 = r5
            r5 = r0
            goto L3b
        L39:
            goto L44
        L3b:
            if (r2 == 0) goto L40
            r2.close()     // Catch: java.io.IOException -> L40
        L40:
            r1.close()     // Catch: java.io.IOException -> L43
        L43:
            throw r5
        L44:
            if (r5 == 0) goto L31
            r5.close()     // Catch: java.io.IOException -> L31
            goto L31
        L4a:
            androidx.work.b r5 = new androidx.work.b
            r5.<init>(r0)
            return r5
        L50:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.b.g(byte[]):androidx.work.b");
    }

    public static byte[] k(b bVar) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeInt(bVar.j());
                    for (Map.Entry entry : bVar.a.entrySet()) {
                        objectOutputStream2.writeUTF((String) entry.getKey());
                        objectOutputStream2.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream2.close();
                    } catch (IOException unused) {
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused2) {
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                } catch (IOException unused3) {
                    objectOutputStream = objectOutputStream2;
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused5) {
                    }
                    return byteArray;
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException unused6) {
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException unused7) {
                        throw th;
                    }
                }
            } catch (IOException unused8) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        Set<String> setKeySet = this.a.keySet();
        if (!setKeySet.equals(bVar.a.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            Object obj2 = this.a.get(str);
            Object obj3 = bVar.a.get(str);
            if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                return false;
            }
        }
        return true;
    }

    public Map h() {
        return DesugarCollections.unmodifiableMap(this.a);
    }

    public int hashCode() {
        return this.a.hashCode() * 31;
    }

    public String i(String str) {
        Object obj = this.a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public int j() {
        return this.a.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.a.isEmpty()) {
            for (String str : this.a.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = this.a.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public b(Map map) {
        this.a = new HashMap(map);
    }
}

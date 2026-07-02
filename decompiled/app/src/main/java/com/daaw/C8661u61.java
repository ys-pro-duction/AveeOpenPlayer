package com.daaw;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: renamed from: com.daaw.u61, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8661u61 {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final C9505x61 f;
    public final String g;
    public final String[] h;
    public final HashMap i;
    public final HashMap j;
    public List k;

    public C8661u61(String str, String str2, long j, long j2, C9505x61 c9505x61, String[] strArr, String str3) {
        this.a = str;
        this.b = str2;
        this.f = c9505x61;
        this.h = strArr;
        this.c = str2 != null;
        this.d = j;
        this.e = j2;
        this.g = (String) AbstractC7115ob.e(str3);
        this.i = new HashMap();
        this.j = new HashMap();
    }

    public static C8661u61 c(String str, long j, long j2, C9505x61 c9505x61, String[] strArr, String str2) {
        return new C8661u61(str, null, j, j2, c9505x61, strArr, str2);
    }

    public static C8661u61 d(String str) {
        return new C8661u61(null, AbstractC9226w61.b(str), -9223372036854775807L, -9223372036854775807L, null, null, "");
    }

    public static SpannableStringBuilder k(String str, Map map) {
        if (!map.containsKey(str)) {
            map.put(str, new SpannableStringBuilder());
        }
        return (SpannableStringBuilder) map.get(str);
    }

    public void a(C8661u61 c8661u61) {
        if (this.k == null) {
            this.k = new ArrayList();
        }
        this.k.add(c8661u61);
    }

    public final void b(Map map, SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        C9505x61 c9505x61D = AbstractC9226w61.d(this.f, this.h, map);
        if (c9505x61D != null) {
            AbstractC9226w61.a(spannableStringBuilder, i, i2, c9505x61D);
        }
    }

    public final SpannableStringBuilder e(SpannableStringBuilder spannableStringBuilder) {
        int i;
        int i2;
        int length = spannableStringBuilder.length();
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (spannableStringBuilder.charAt(i4) == ' ') {
                int i5 = i4 + 1;
                int i6 = i5;
                while (i6 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i6) == ' ') {
                    i6++;
                }
                int i7 = i6 - i5;
                if (i7 > 0) {
                    spannableStringBuilder.delete(i4, i4 + i7);
                    length -= i7;
                }
            }
        }
        if (length > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
            length--;
        }
        int i8 = 0;
        while (true) {
            i = length - 1;
            if (i8 >= i) {
                break;
            }
            if (spannableStringBuilder.charAt(i8) == '\n') {
                int i9 = i8 + 1;
                if (spannableStringBuilder.charAt(i9) == ' ') {
                    spannableStringBuilder.delete(i9, i8 + 2);
                    length--;
                }
            }
            i8++;
        }
        if (length > 0 && spannableStringBuilder.charAt(i) == ' ') {
            spannableStringBuilder.delete(i, length);
            length--;
        }
        while (true) {
            i2 = length - 1;
            if (i3 >= i2) {
                break;
            }
            if (spannableStringBuilder.charAt(i3) == ' ') {
                int i10 = i3 + 1;
                if (spannableStringBuilder.charAt(i10) == '\n') {
                    spannableStringBuilder.delete(i3, i10);
                    length--;
                }
            }
            i3++;
        }
        if (length > 0 && spannableStringBuilder.charAt(i2) == '\n') {
            spannableStringBuilder.delete(i2, length);
        }
        return spannableStringBuilder;
    }

    public C8661u61 f(int i) {
        List list = this.k;
        if (list != null) {
            return (C8661u61) list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List list = this.k;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List h(long j, Map map, Map map2) {
        TreeMap treeMap = new TreeMap();
        n(j, false, this.g, treeMap);
        m(j, map, treeMap);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : treeMap.entrySet()) {
            C8947v61 c8947v61 = (C8947v61) map2.get(entry.getKey());
            arrayList.add(new C1631Mu(e((SpannableStringBuilder) entry.getValue()), (Layout.Alignment) null, c8947v61.c, c8947v61.d, c8947v61.e, c8947v61.b, Integer.MIN_VALUE, c8947v61.f, c8947v61.g, c8947v61.h));
        }
        return arrayList;
    }

    public final void i(TreeSet treeSet, boolean z) {
        boolean zEquals = "p".equals(this.a);
        if (z || zEquals) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.k == null) {
            return;
        }
        for (int i = 0; i < this.k.size(); i++) {
            ((C8661u61) this.k.get(i)).i(treeSet, z || zEquals);
        }
    }

    public long[] j() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public boolean l(long j) {
        long j2 = this.d;
        if (j2 == -9223372036854775807L && this.e == -9223372036854775807L) {
            return true;
        }
        if (j2 <= j && this.e == -9223372036854775807L) {
            return true;
        }
        if (j2 != -9223372036854775807L || j >= this.e) {
            return j2 <= j && j < this.e;
        }
        return true;
    }

    public final void m(long j, Map map, Map map2) {
        int iIntValue;
        if (l(j)) {
            Iterator it = this.j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                iIntValue = this.i.containsKey(str) ? ((Integer) this.i.get(str)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    b(map, (SpannableStringBuilder) map2.get(str), iIntValue, iIntValue2);
                }
            }
            while (iIntValue < g()) {
                f(iIntValue).m(j, map, map2);
                iIntValue++;
            }
        }
    }

    public final void n(long j, boolean z, String str, Map map) {
        this.i.clear();
        this.j.clear();
        if ("metadata".equals(this.a)) {
            return;
        }
        if (!"".equals(this.g)) {
            str = this.g;
        }
        String str2 = str;
        if (this.c && z) {
            k(str2, map).append((CharSequence) this.b);
            return;
        }
        if ("br".equals(this.a) && z) {
            k(str2, map).append('\n');
            return;
        }
        if (l(j)) {
            for (Map.Entry entry : map.entrySet()) {
                this.i.put(entry.getKey(), Integer.valueOf(((SpannableStringBuilder) entry.getValue()).length()));
            }
            boolean zEquals = "p".equals(this.a);
            int i = 0;
            while (i < g()) {
                long j2 = j;
                Map map2 = map;
                f(i).n(j2, z || zEquals, str2, map2);
                i++;
                j = j2;
                map = map2;
            }
            Map map3 = map;
            if (zEquals) {
                AbstractC9226w61.c(k(str2, map3));
            }
            for (Map.Entry entry2 : map3.entrySet()) {
                this.j.put(entry2.getKey(), Integer.valueOf(((SpannableStringBuilder) entry2.getValue()).length()));
            }
        }
    }
}

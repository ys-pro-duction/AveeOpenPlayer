package com.daaw;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class VJ {
    public Map a = new HashMap();
    public final Map b = new HashMap();
    public int c = 0;
    public int d = Integer.MAX_VALUE;
    public boolean e = false;
    public final Set f;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC8325su.values().length];
            a = iArr;
            try {
                iArr[EnumC8325su.SECOND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC8325su.MINUTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[EnumC8325su.HOUR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[EnumC8325su.DAY_OF_WEEK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[EnumC8325su.DAY_OF_MONTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[EnumC8325su.MONTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[EnumC8325su.DAY_OF_YEAR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public VJ() {
        HashSet hashSet = new HashSet();
        this.f = hashSet;
        hashSet.add(EnumC5128hV0.NONE);
    }

    public static Map g() {
        HashMap map = new HashMap();
        map.put("MON", 1);
        map.put("TUE", 2);
        map.put("WED", 3);
        map.put("THU", 4);
        map.put("FRI", 5);
        map.put("SAT", 6);
        map.put("SUN", 7);
        return map;
    }

    public static VJ i() {
        return new VJ();
    }

    public static Map j() {
        HashMap map = new HashMap();
        map.put("JAN", 1);
        map.put("FEB", 2);
        map.put("MAR", 3);
        map.put("APR", 4);
        map.put("MAY", 5);
        map.put("JUN", 6);
        map.put("JUL", 7);
        map.put("AUG", 8);
        map.put("SEP", 9);
        map.put("OCT", 10);
        map.put("NOV", 11);
        map.put("DEC", 12);
        return map;
    }

    public VJ a() {
        this.f.add(EnumC5128hV0.HASH);
        return this;
    }

    public VJ b() {
        this.f.add(EnumC5128hV0.L);
        return this;
    }

    public VJ c() {
        this.f.add(EnumC5128hV0.LW);
        return this;
    }

    public VJ d() {
        this.f.add(EnumC5128hV0.QUESTION_MARK);
        return this;
    }

    public VJ e() {
        this.f.add(EnumC5128hV0.W);
        return this;
    }

    public UJ f() {
        return new UJ(this.a, this.b, this.f, this.c, this.d, this.e);
    }

    public VJ h(EnumC8325su enumC8325su) {
        switch (a.a[enumC8325su.ordinal()]) {
            case 1:
            case 2:
                this.d = 59;
                break;
            case 3:
                this.d = 23;
                break;
            case 4:
                this.a = g();
                this.d = 6;
                break;
            case 5:
                this.c = 1;
                this.d = 31;
                break;
            case 6:
                this.a = j();
                this.c = 1;
                this.d = 12;
                break;
            case 7:
                this.c = 1;
                this.d = 366;
                break;
        }
        return this;
    }

    public VJ k(int i, int i2) {
        this.b.put(Integer.valueOf(i), Integer.valueOf(i2));
        return this;
    }

    public VJ l(int i) {
        if (i > 0 || this.d < this.a.size()) {
            for (Map.Entry entry : this.a.entrySet()) {
                int iIntValue = ((Integer) entry.getValue()).intValue() + i;
                int i2 = this.d;
                if (iIntValue > i2) {
                    iIntValue -= this.a.size();
                } else {
                    int i3 = this.c;
                    if (iIntValue < i3) {
                        iIntValue += i3 - i2;
                    }
                }
                this.a.put(entry.getKey(), Integer.valueOf(iIntValue));
            }
        }
        return this;
    }

    public VJ m() {
        this.e = true;
        return this;
    }

    public VJ n(int i, int i2) {
        this.c = i;
        this.d = i2;
        return this;
    }
}

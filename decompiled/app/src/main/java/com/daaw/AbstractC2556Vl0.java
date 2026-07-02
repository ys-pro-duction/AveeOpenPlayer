package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.Vl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2556Vl0 {
    public static final int a(List list, int i) {
        G10.g(list, "paragraphInfoList");
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            C0897Fs0 c0897Fs0 = (C0897Fs0) list.get(i3);
            byte b = c0897Fs0.f() > i ? (byte) 1 : c0897Fs0.b() <= i ? (byte) -1 : (byte) 0;
            if (b < 0) {
                i2 = i3 + 1;
            } else {
                if (b <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int b(List list, int i) {
        G10.g(list, "paragraphInfoList");
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            C0897Fs0 c0897Fs0 = (C0897Fs0) list.get(i3);
            byte b = c0897Fs0.g() > i ? (byte) 1 : c0897Fs0.c() <= i ? (byte) -1 : (byte) 0;
            if (b < 0) {
                i2 = i3 + 1;
            } else {
                if (b <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int c(List list, float f) {
        G10.g(list, "paragraphInfoList");
        int size = list.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            C0897Fs0 c0897Fs0 = (C0897Fs0) list.get(i2);
            byte b = c0897Fs0.h() > f ? (byte) 1 : c0897Fs0.a() <= f ? (byte) -1 : (byte) 0;
            if (b < 0) {
                i = i2 + 1;
            } else {
                if (b <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }
}

package com.daaw;

import java.util.PriorityQueue;

/* JADX INFO: renamed from: com.daaw.rA1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7844rA1 {
    public static long a(long j, int i) {
        if (i == 1) {
            return j;
        }
        int i2 = i >> 1;
        long j2 = (j * j) % 1073807359;
        return ((i & 1) == 0 ? a(j2, i2) : j * (a(j2, i2) % 1073807359)) % 1073807359;
    }

    public static String b(String[] strArr, int i, int i2) {
        int i3 = i2 + i;
        if (strArr.length < i3) {
            AbstractC4274eT1.zzg("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i4 = i3 - 1;
            if (i >= i4) {
                sb.append(strArr[i4]);
                return sb.toString();
            }
            sb.append(strArr[i]);
            sb.append(' ');
            i++;
        }
    }

    public static void c(String[] strArr, int i, int i2, PriorityQueue priorityQueue) {
        int length = strArr.length;
        if (length < 6) {
            d(i, e(strArr, 0, length), b(strArr, 0, length), length, priorityQueue);
            return;
        }
        long jE = e(strArr, 0, 6);
        d(i, jE, b(strArr, 0, 6), 6, priorityQueue);
        int i3 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i3 >= length2 - 5) {
                return;
            }
            long jA = AbstractC7008oA1.a(strArr[i3 - 1]);
            long jA2 = AbstractC7008oA1.a(strArr[i3 + 5]);
            String strB = b(strArr, i3, 6);
            jE = ((((((jE + 1073807359) - ((a(16785407L, 5) * ((jA + 2147483647L) % 1073807359)) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((jA2 + 2147483647L) % 1073807359)) % 1073807359;
            d(i, jE, strB, length2, priorityQueue);
            i3++;
        }
    }

    public static void d(int i, long j, String str, int i2, PriorityQueue priorityQueue) {
        C7566qA1 c7566qA1 = new C7566qA1(j, str, i2);
        if ((priorityQueue.size() != i || (((C7566qA1) priorityQueue.peek()).c <= c7566qA1.c && ((C7566qA1) priorityQueue.peek()).a <= c7566qA1.a)) && !priorityQueue.contains(c7566qA1)) {
            priorityQueue.add(c7566qA1);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    public static long e(String[] strArr, int i, int i2) {
        long jA = (((long) AbstractC7008oA1.a(strArr[0])) + 2147483647L) % 1073807359;
        for (int i3 = 1; i3 < i2; i3++) {
            jA = (((jA * 16785407) % 1073807359) + ((((long) AbstractC7008oA1.a(strArr[i3])) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return jA;
    }
}

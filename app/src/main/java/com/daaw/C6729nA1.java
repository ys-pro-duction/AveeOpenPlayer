package com.daaw;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: com.daaw.nA1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6729nA1 {
    public final int a;
    public final AbstractC4198eA1 b = new C7287pA1();

    public C6729nA1(int i) {
        this.a = i;
    }

    public final String a(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append(((String) arrayList.get(i)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] strArrSplit = sb.toString().split("\n");
        if (strArrSplit.length == 0) {
            return "";
        }
        C4766gA1 c4766gA1 = new C4766gA1();
        PriorityQueue priorityQueue = new PriorityQueue(this.a, new C4477fA1(this));
        for (String str : strArrSplit) {
            String[] strArrB = AbstractC7008oA1.b(str, false);
            if (strArrB.length != 0) {
                AbstractC7844rA1.c(strArrB, this.a, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                c4766gA1.b.write(this.b.b(((C7566qA1) it.next()).b));
            } catch (IOException e) {
                AbstractC4274eT1.zzh("Error while writing hash to byteStream", e);
            }
        }
        return c4766gA1.toString();
    }
}

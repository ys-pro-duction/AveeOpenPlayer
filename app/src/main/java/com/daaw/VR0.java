package com.daaw;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class VR0 {
    public final BlockingQueue a;

    public class a {
        public final short[] a;

        public a(short[] sArr) {
            this.a = sArr;
        }

        public void a() {
            VR0.this.c(this);
        }
    }

    public VR0(int i) {
        this.a = new ArrayBlockingQueue(i, true);
    }

    public a a(int i, long j) {
        try {
            a aVar = (a) this.a.poll(j, TimeUnit.MILLISECONDS);
            if (aVar != null) {
                if (aVar.a.length == i) {
                    return aVar;
                }
            }
        } catch (InterruptedException unused) {
        }
        return b(i);
    }

    public a b(int i) {
        return new a(new short[i]);
    }

    public void c(a aVar) {
        this.a.offer(aVar);
    }
}

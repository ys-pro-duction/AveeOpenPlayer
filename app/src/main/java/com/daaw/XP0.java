package com.daaw;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public class XP0 implements Executor {
    public static final Logger D = Logger.getLogger(XP0.class.getName());
    public boolean B;
    public ArrayDeque C;

    public final void a() {
        while (true) {
            Runnable runnable = (Runnable) this.C.poll();
            if (runnable == null) {
                return;
            }
            try {
                runnable.run();
            } catch (Throwable th) {
                D.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
            }
        }
    }

    public final void b(Runnable runnable) {
        if (this.C == null) {
            this.C = new ArrayDeque(4);
        }
        this.C.add(runnable);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        AbstractC7785qy0.o(runnable, "'task' must not be null.");
        if (this.B) {
            b(runnable);
            return;
        }
        this.B = true;
        try {
            runnable.run();
        } catch (Throwable th) {
            try {
                D.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
                if (this.C != null) {
                }
            } finally {
                if (this.C != null) {
                    a();
                }
                this.B = false;
            }
        }
    }
}

package com.daaw;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class V30 extends CancellationException {
    public final transient U30 B;

    public V30(String str, Throwable th, U30 u30) {
        super(str);
        this.B = u30;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V30)) {
            return false;
        }
        V30 v30 = (V30) obj;
        return G10.c(v30.getMessage(), getMessage()) && G10.c(v30.B, this.B) && G10.c(v30.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        G10.d(message);
        int iHashCode = ((message.hashCode() * 31) + this.B.hashCode()) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.B;
    }
}

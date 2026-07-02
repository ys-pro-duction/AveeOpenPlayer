package com.daaw;

import j$.util.Objects;
import java.io.Serializable;

/* JADX INFO: renamed from: com.daaw.mu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6652mu implements Serializable {
    public final String B;

    public AbstractC6652mu(String str) {
        this.B = str;
    }

    public String a() {
        return this.B;
    }

    public abstract boolean b(InterfaceC6094ku interfaceC6094ku);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.B, ((AbstractC6652mu) obj).B);
    }

    public int hashCode() {
        return Objects.hash(this.B);
    }
}

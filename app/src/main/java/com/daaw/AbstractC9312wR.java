package com.daaw;

/* JADX INFO: renamed from: com.daaw.wR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9312wR extends AbstractC1687Ni implements InterfaceC7353pR, InterfaceC8381t60 {
    private final int arity;
    private final int flags;

    public AbstractC9312wR(int i) {
        this(i, AbstractC1687Ni.NO_RECEIVER, null, null, null, 0);
    }

    @Override // com.daaw.AbstractC1687Ni
    public InterfaceC9220w50 computeReflected() {
        return AbstractC5624jG0.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC9312wR) {
            AbstractC9312wR abstractC9312wR = (AbstractC9312wR) obj;
            return getName().equals(abstractC9312wR.getName()) && getSignature().equals(abstractC9312wR.getSignature()) && this.flags == abstractC9312wR.flags && this.arity == abstractC9312wR.arity && G10.c(getBoundReceiver(), abstractC9312wR.getBoundReceiver()) && G10.c(getOwner(), abstractC9312wR.getOwner());
        }
        if (obj instanceof InterfaceC8381t60) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // com.daaw.InterfaceC7353pR
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // com.daaw.InterfaceC8381t60
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // com.daaw.InterfaceC8381t60
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // com.daaw.InterfaceC8381t60
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // com.daaw.InterfaceC8381t60
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // com.daaw.InterfaceC9220w50
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        InterfaceC9220w50 interfaceC9220w50Compute = compute();
        if (interfaceC9220w50Compute != this) {
            return interfaceC9220w50Compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public AbstractC9312wR(int i, Object obj) {
        this(i, obj, null, null, null, 0);
    }

    @Override // com.daaw.AbstractC1687Ni
    public InterfaceC8381t60 getReflected() {
        return (InterfaceC8381t60) super.getReflected();
    }

    public AbstractC9312wR(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = i2 >> 1;
    }
}

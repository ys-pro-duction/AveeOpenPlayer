package com.daaw;

/* JADX INFO: renamed from: com.daaw.oA0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7007oA0 extends AbstractC1687Ni implements W60 {
    public final boolean B;

    public AbstractC7007oA0() {
        this.B = false;
    }

    @Override // com.daaw.AbstractC1687Ni
    public InterfaceC9220w50 compute() {
        return this.B ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7007oA0) {
            AbstractC7007oA0 abstractC7007oA0 = (AbstractC7007oA0) obj;
            return getOwner().equals(abstractC7007oA0.getOwner()) && getName().equals(abstractC7007oA0.getName()) && getSignature().equals(abstractC7007oA0.getSignature()) && G10.c(getBoundReceiver(), abstractC7007oA0.getBoundReceiver());
        }
        if (obj instanceof W60) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // com.daaw.AbstractC1687Ni
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public W60 getReflected() {
        if (this.B) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (W60) super.getReflected();
    }

    public String toString() {
        InterfaceC9220w50 interfaceC9220w50Compute = compute();
        if (interfaceC9220w50Compute != this) {
            return interfaceC9220w50Compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public AbstractC7007oA0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.B = (i & 2) == 2;
    }
}

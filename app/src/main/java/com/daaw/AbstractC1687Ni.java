package com.daaw;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Ni, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1687Ni implements InterfaceC9220w50, Serializable {
    public static final Object NO_RECEIVER = a.B;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient InterfaceC9220w50 reflected;
    private final String signature;

    /* JADX INFO: renamed from: com.daaw.Ni$a */
    public static class a implements Serializable {
        public static final a B = new a();
    }

    public AbstractC1687Ni() {
        this(NO_RECEIVER);
    }

    @Override // com.daaw.InterfaceC9220w50
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // com.daaw.InterfaceC9220w50
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public InterfaceC9220w50 compute() {
        InterfaceC9220w50 interfaceC9220w50 = this.reflected;
        if (interfaceC9220w50 != null) {
            return interfaceC9220w50;
        }
        InterfaceC9220w50 interfaceC9220w50ComputeReflected = computeReflected();
        this.reflected = interfaceC9220w50ComputeReflected;
        return interfaceC9220w50ComputeReflected;
    }

    public abstract InterfaceC9220w50 computeReflected();

    @Override // com.daaw.InterfaceC8941v50
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // com.daaw.InterfaceC9220w50
    public String getName() {
        return this.name;
    }

    public InterfaceC6429m60 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? AbstractC5624jG0.c(cls) : AbstractC5624jG0.b(cls);
    }

    @Override // com.daaw.InterfaceC9220w50
    public List<S60> getParameters() {
        return getReflected().getParameters();
    }

    public InterfaceC9220w50 getReflected() {
        InterfaceC9220w50 interfaceC9220w50Compute = compute();
        if (interfaceC9220w50Compute != this) {
            return interfaceC9220w50Compute;
        }
        throw new F80();
    }

    @Override // com.daaw.InterfaceC9220w50
    public InterfaceC7550q70 getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // com.daaw.InterfaceC9220w50
    public List<InterfaceC9509x70> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // com.daaw.InterfaceC9220w50
    public E70 getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // com.daaw.InterfaceC9220w50
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // com.daaw.InterfaceC9220w50
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // com.daaw.InterfaceC9220w50
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    public AbstractC1687Ni(Object obj) {
        this(obj, null, null, null, false);
    }

    public AbstractC1687Ni(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }
}

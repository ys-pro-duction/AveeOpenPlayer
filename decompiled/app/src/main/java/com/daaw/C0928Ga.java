package com.daaw;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.Ga, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0928Ga extends ArrayList implements InterfaceC6993o71 {
    public C0928Ga(int i) {
        super(i);
    }

    public /* bridge */ boolean D(InterfaceC7272p71 interfaceC7272p71) {
        return super.remove(interfaceC7272p71);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof InterfaceC7272p71) {
            return e((InterfaceC7272p71) obj);
        }
        return false;
    }

    public /* bridge */ boolean e(InterfaceC7272p71 interfaceC7272p71) {
        return super.contains(interfaceC7272p71);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof InterfaceC7272p71) {
            return w((InterfaceC7272p71) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof InterfaceC7272p71) {
            return y((InterfaceC7272p71) obj);
        }
        return -1;
    }

    public /* bridge */ int q() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof InterfaceC7272p71) {
            return D((InterfaceC7272p71) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return q();
    }

    public /* bridge */ int w(InterfaceC7272p71 interfaceC7272p71) {
        return super.indexOf(interfaceC7272p71);
    }

    public /* bridge */ int y(InterfaceC7272p71 interfaceC7272p71) {
        return super.lastIndexOf(interfaceC7272p71);
    }
}

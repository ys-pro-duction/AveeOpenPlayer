package com.daaw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Gp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0988Gp implements InterfaceC4995h01 {
    public final List b;

    public C0988Gp(List list) {
        G10.g(list, "inner");
        this.b = list;
    }

    @Override // com.daaw.InterfaceC4995h01
    public void a(InterfaceC4923gl interfaceC4923gl, List list, C0504Ca0 c0504Ca0) {
        G10.g(interfaceC4923gl, "thisDescriptor");
        G10.g(list, "result");
        G10.g(c0504Ca0, "c");
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((InterfaceC4995h01) it.next()).a(interfaceC4923gl, list, c0504Ca0);
        }
    }

    @Override // com.daaw.InterfaceC4995h01
    public List b(InterfaceC4923gl interfaceC4923gl, C0504Ca0 c0504Ca0) {
        G10.g(interfaceC4923gl, "thisDescriptor");
        G10.g(c0504Ca0, "c");
        List list = this.b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC2141Rm.A(arrayList, ((InterfaceC4995h01) it.next()).b(interfaceC4923gl, c0504Ca0));
        }
        return arrayList;
    }

    @Override // com.daaw.InterfaceC4995h01
    public void c(InterfaceC4923gl interfaceC4923gl, C2352Tm0 c2352Tm0, Collection collection, C0504Ca0 c0504Ca0) {
        G10.g(interfaceC4923gl, "thisDescriptor");
        G10.g(c2352Tm0, "name");
        G10.g(collection, "result");
        G10.g(c0504Ca0, "c");
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((InterfaceC4995h01) it.next()).c(interfaceC4923gl, c2352Tm0, collection, c0504Ca0);
        }
    }

    @Override // com.daaw.InterfaceC4995h01
    public void d(InterfaceC4923gl interfaceC4923gl, C2352Tm0 c2352Tm0, List list, C0504Ca0 c0504Ca0) {
        G10.g(interfaceC4923gl, "thisDescriptor");
        G10.g(c2352Tm0, "name");
        G10.g(list, "result");
        G10.g(c0504Ca0, "c");
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((InterfaceC4995h01) it.next()).d(interfaceC4923gl, c2352Tm0, list, c0504Ca0);
        }
    }

    @Override // com.daaw.InterfaceC4995h01
    public List e(InterfaceC4923gl interfaceC4923gl, C0504Ca0 c0504Ca0) {
        G10.g(interfaceC4923gl, "thisDescriptor");
        G10.g(c0504Ca0, "c");
        List list = this.b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC2141Rm.A(arrayList, ((InterfaceC4995h01) it.next()).e(interfaceC4923gl, c0504Ca0));
        }
        return arrayList;
    }

    @Override // com.daaw.InterfaceC4995h01
    public C4765gA0 f(InterfaceC4923gl interfaceC4923gl, C4765gA0 c4765gA0, C0504Ca0 c0504Ca0) {
        G10.g(interfaceC4923gl, "thisDescriptor");
        G10.g(c4765gA0, "propertyDescriptor");
        G10.g(c0504Ca0, "c");
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            c4765gA0 = ((InterfaceC4995h01) it.next()).f(interfaceC4923gl, c4765gA0, c0504Ca0);
        }
        return c4765gA0;
    }

    @Override // com.daaw.InterfaceC4995h01
    public void g(InterfaceC4923gl interfaceC4923gl, C2352Tm0 c2352Tm0, Collection collection, C0504Ca0 c0504Ca0) {
        G10.g(interfaceC4923gl, "thisDescriptor");
        G10.g(c2352Tm0, "name");
        G10.g(collection, "result");
        G10.g(c0504Ca0, "c");
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((InterfaceC4995h01) it.next()).g(interfaceC4923gl, c2352Tm0, collection, c0504Ca0);
        }
    }

    @Override // com.daaw.InterfaceC4995h01
    public List h(InterfaceC4923gl interfaceC4923gl, C0504Ca0 c0504Ca0) {
        G10.g(interfaceC4923gl, "thisDescriptor");
        G10.g(c0504Ca0, "c");
        List list = this.b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC2141Rm.A(arrayList, ((InterfaceC4995h01) it.next()).h(interfaceC4923gl, c0504Ca0));
        }
        return arrayList;
    }
}

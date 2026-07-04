package com.daaw;

import java.util.Comparator;

/* JADX INFO: renamed from: com.daaw.Ri0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2126Ri0 implements Comparator {
    public static final C2126Ri0 B = new C2126Ri0();

    public static Integer b(InterfaceC8612tw interfaceC8612tw, InterfaceC8612tw interfaceC8612tw2) {
        int iC = c(interfaceC8612tw2) - c(interfaceC8612tw);
        if (iC != 0) {
            return Integer.valueOf(iC);
        }
        if (AbstractC7006oA.B(interfaceC8612tw) && AbstractC7006oA.B(interfaceC8612tw2)) {
            return 0;
        }
        int iCompareTo = interfaceC8612tw.getName().compareTo(interfaceC8612tw2.getName());
        if (iCompareTo != 0) {
            return Integer.valueOf(iCompareTo);
        }
        return null;
    }

    public static int c(InterfaceC8612tw interfaceC8612tw) {
        if (AbstractC7006oA.B(interfaceC8612tw)) {
            return 8;
        }
        if (interfaceC8612tw instanceof InterfaceC7195or) {
            return 7;
        }
        if (interfaceC8612tw instanceof InterfaceC4476fA0) {
            return ((InterfaceC4476fA0) interfaceC8612tw).i0() == null ? 6 : 5;
        }
        if (interfaceC8612tw instanceof InterfaceC8468tR) {
            return ((InterfaceC8468tR) interfaceC8612tw).i0() == null ? 4 : 3;
        }
        if (interfaceC8612tw instanceof InterfaceC4923gl) {
            return 2;
        }
        return interfaceC8612tw instanceof InterfaceC5586j71 ? 1 : 0;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(InterfaceC8612tw interfaceC8612tw, InterfaceC8612tw interfaceC8612tw2) {
        Integer numB = b(interfaceC8612tw, interfaceC8612tw2);
        if (numB != null) {
            return numB.intValue();
        }
        return 0;
    }
}

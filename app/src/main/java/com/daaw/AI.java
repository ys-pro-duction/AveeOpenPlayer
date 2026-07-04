package com.daaw;

import j$.time.ZonedDateTime;
import j$.util.Optional;

/* JADX INFO: loaded from: classes.dex */
public interface AI {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC8325su.values().length];
            a = iArr;
            try {
                iArr[EnumC8325su.SECOND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC8325su.MINUTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[EnumC8325su.HOUR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[EnumC8325su.DAY_OF_WEEK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[EnumC8325su.DAY_OF_MONTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[EnumC8325su.MONTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[EnumC8325su.YEAR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[EnumC8325su.DAY_OF_YEAR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    Optional a(ZonedDateTime zonedDateTime);
}

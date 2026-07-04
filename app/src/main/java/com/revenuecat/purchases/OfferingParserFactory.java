package com.revenuecat.purchases;

import com.daaw.G10;
import com.revenuecat.purchases.amazon.AmazonOfferingParser;
import com.revenuecat.purchases.common.GoogleOfferingParser;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.OfferingParser;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/OfferingParserFactory;", "", "()V", "createOfferingParser", "Lcom/revenuecat/purchases/common/OfferingParser;", ProductResponseJsonKeys.STORE, "Lcom/revenuecat/purchases/Store;", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class OfferingParserFactory {
    public static final OfferingParserFactory INSTANCE = new OfferingParserFactory();

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Store.values().length];
            try {
                iArr[Store.PLAY_STORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Store.AMAZON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private OfferingParserFactory() {
    }

    public final OfferingParser createOfferingParser(Store store) throws IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException {
        G10.g(store, ProductResponseJsonKeys.STORE);
        int i = WhenMappings.$EnumSwitchMapping$0[store.ordinal()];
        if (i == 1) {
            return new GoogleOfferingParser();
        }
        if (i == 2) {
            try {
                Object objNewInstance = AmazonOfferingParser.class.getConstructor(null).newInstance(null);
                G10.e(objNewInstance, "null cannot be cast to non-null type com.revenuecat.purchases.common.OfferingParser");
                return (OfferingParser) objNewInstance;
            } catch (ClassNotFoundException e) {
                LogUtilsKt.errorLog("Make sure purchases-amazon is added as dependency", e);
                throw e;
            }
        }
        LogUtilsKt.errorLog$default("Incompatible store (" + store + ") used", null, 2, null);
        throw new IllegalArgumentException("Couldn't configure SDK. Incompatible store (" + store + ") used");
    }
}

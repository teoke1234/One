//package com.teoke.ulties;
//
//import com.teoke.testdata.TestData;
//import io.github.sskorol.core.DataSupplier;
//import io.github.sskorol.data.TestDataReader;
//import io.github.sskorol.data.XlsxReader;
//import one.util.streamex.StreamEx;
//
//public final class DataProviderUtils {
//
//    private DataProviderUtils() {
//    }
//
//
//    @DataSupplier()
//    public static StreamEx<TestData> getData() {
//
//        return TestDataReader.use(XlsxReader.class)
//                .withTarget(TestData.class)
//                .withSource("Book1.xlsx")
//                .read();
//
//    }
//
//}

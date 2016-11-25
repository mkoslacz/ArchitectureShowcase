package com.mateuszkoslacz.moviper.rxsample.viper.TestUtils;

import com.mateuszkoslacz.moviper.rxsample.data.rdp.specification.list.AllUsersSpecification;
import com.mateuszkoslacz.moviper.rxsample.di.modules.specification.AllUsersSpecificationModule;

public class AllUsersSpecificationTestModule extends AllUsersSpecificationModule {

    @Override
    public AllUsersSpecification provideAllUsersSpecification() {
        return new AllUsersRetrofitTestSpecification();
    }
}

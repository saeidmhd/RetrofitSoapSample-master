/*
 * Copyright 2016. Alejandro Sánchez
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.asanchezyu.retrofitsoap.util;

import com.asanchezyu.retrofitsoap.domain.model.ZipCodeDomain;
import com.asanchezyu.retrofitsoap.ui.model.ZipCodeData;

import javax.inject.Inject;

/**
 * Class Description.
 *
 * @author asanchezyu@gmail.com.
 * @version 1.0.
 * @since 15/6/16.
 */
public class ZipCodeMapperUi extends EntityMapper<ZipCodeData,ZipCodeDomain> {

    @Inject
    public ZipCodeMapperUi() {
    }

    @Override
    public ZipCodeDomain map(ZipCodeData element) {
        ZipCodeDomain element1 = new ZipCodeDomain();
        element1.setCity(element.getCity());
        element1.setTimeZone(element.getTimeZone());
        element1.setAreaCode(element.getAreaCode());
        element1.setState(element.getState());
        element1.setZipCode(element.getZipCode());
        return element1;
    }

    @Override
    public ZipCodeData reverseMap(ZipCodeDomain element) {
        ZipCodeData codeData = new ZipCodeData();
        codeData.setCity(element.getCity());
        codeData.setState(element.getState());
        codeData.setAreaCode(element.getAreaCode());
        codeData.setTimeZone(element.getTimeZone());
        codeData.setZipCode(element.getZipCode());
        return codeData;
    }

}

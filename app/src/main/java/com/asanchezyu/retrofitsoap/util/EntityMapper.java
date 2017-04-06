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

import java.util.ArrayList;
import java.util.List;

/**
 * Class Description.
 *
 * @author asanchezyu@gmail.com.
 * @version 1.0.
 * @since 15/6/16.
 */
public abstract class EntityMapper<K, T> {

    public abstract T map(K element);

    public abstract K reverseMap(T element);

    public List<T> mapList(List<K> list){

        List<T> returnedList = new ArrayList<>();

        for(K element: list ){

            returnedList.add( map(element) );

        }

        return returnedList;


    }

    public List<K> reverseMapList(List<T> list){

        List<K> returnedList = new ArrayList<>();

        for(T element: list ){

            returnedList.add( reverseMap(element) );

        }

        return returnedList;

    }

}

/*
 *  Copyright 1999-2022 Seata.io Group.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package io.seata.samples.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Table(name = "sys_stock")
public class Stock implements Serializable {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;
    private Long quantity;
    private BigDecimal price;

    public Long getId() {
        return id;
    }

    public Stock setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getQuantity() {
        return quantity;
    }

    public Stock setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Stock setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    @Override
    public String toString() {
        return "Stock{" +
            "id=" + id +
            ", quantity=" + quantity +
            ", price=" + price +
            '}';
    }
}
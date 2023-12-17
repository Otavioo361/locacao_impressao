/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ifmg.projeto_impressora.model.dao;

import java.util.List;

/**
 *
 * @author Otavio
 */
public interface IDao {
    public void save(Object obj);

    public boolean delete(Object obj);

    public Object find(int id);
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.swing.JOptionPane;
import model.Clientes;

/**
 *
 * @author Toninho Programação
 */
public class ClienteService {

    private static List<Clientes> lista = new ArrayList<>();

    public ClienteService() {
    }

    public String listarTodos() {

        return lista.toString();

    }

    public boolean acharPeloCpf(Integer cpf) {
        for (Clientes clientes : lista) {
            if (Objects.equals(clientes.getCpf(), cpf)) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "CPF não encontrado!");
            }
        }

        return false;
    }

    public Clientes retornarClientes(Integer cpf) {
        for (Clientes clientes : lista) {
            if (Objects.equals(clientes.getCpf(), cpf)) {
                return clientes;
            } else {
                JOptionPane.showMessageDialog(null, "CPF não encontrado!");
            }

        }

        return null;
    }

    public void add(Clientes clientes) {
        lista.add(clientes);
        JOptionPane.showMessageDialog(null, "Cliente Cadastrado com Sucesso!");
    }

    public void update(Integer cpf, Clientes clientes) {
        if (acharPeloCpf(cpf)) {
            for (Clientes c : lista) {
                if (Objects.equals(c.getCpf(), cpf)) {
                    c.setCpf(cpf);
                    c.setNome(clientes.getNome());
                    c.setRg(clientes.getRg());
                    c.setTel(clientes.getTel());
                    c.setEnd(clientes.getEnd());
                    c.setFamiliares(clientes.getFamiliares());
                    JOptionPane.showMessageDialog(null, "Cliente Alterado Com Sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Cliente Não Alterado!");
                }

            }
        }
    }

    public void delete(Integer cpf) {
        Clientes clientes = retornarClientes(cpf);
        if (clientes == null) {
            JOptionPane.showMessageDialog(null, "CPF não encontrado");
        } else {

           lista.remove(clientes);
           JOptionPane.showMessageDialog(null, "Cliente Removido Com Sucesso!");

        }

    }

}

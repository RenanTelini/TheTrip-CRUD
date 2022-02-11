import React from "react";

export default function Contatos(){
    return (
        <>
            <br/>
            <button type="button" id="btnCriar">Criar novo contato</button><br/>
            <table class="table" id="tabela">
                <thead>
                    <tr id="tituloTabela">
                        <th>
                            E-mail para contato
                        </th>
                        <th>
                            Telefone para contato
                        </th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>
                            agencia@email.com.br
                        </td>
                        <td>
                            (11)4002-8922
                        </td>
                        <td>
                            <button type="button" id="btnEditar">Editar</button> |
                            <button type="button" id="btnDetalhes">Detalhes</button> |
                            <button type="button" id="btnDeletar">Deletar</button>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            funcionario@agencia.org.br
                        </td>
                        <td>
                            (19)98530-0216
                        </td>
                        <td>
                            <button type="button" id="btnEditar">Editar</button> |
                            <button type="button" id="btnDetalhes">Detalhes</button> |
                            <button type="button" id="btnDeletar">Deletar</button>
                        </td>
                    </tr>
                </tbody>
            </table>
                
        </>
    )
}